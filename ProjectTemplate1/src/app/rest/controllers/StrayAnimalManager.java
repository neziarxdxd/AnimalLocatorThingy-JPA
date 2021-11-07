package app.rest.controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.components.StraySightLocationComponent;
import app.entity.Location;
import app.entity.StrayAnimal;
import app.entity.StraySightLocation;



@Component
@Path("/sighting")
public class StrayAnimalManager {
	
	@Autowired
	StraySightLocationComponent straySightComponent;


	@POST
	@Path("/new")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String test(StraySightLocation data) {
		return straySightComponent.addStraySight(data);
	}
	
	@POST
	@Path("/location")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Location location(StraySightLocation data) {
		return straySightComponent.findLocation(data);
	}
	
	@GET
	@Path("/neutered")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<StrayAnimal> findNeutered() {
		List<StrayAnimal> strayAnimal = straySightComponent.selectNeutered();
		System.out.println(strayAnimal);
		return strayAnimal;
	}
	
	@GET
	@Path("/type")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<StrayAnimal> findType(@QueryParam("type") String type) {
		List<StrayAnimal> strayAnimal = straySightComponent.selectType(type);
		System.out.println(strayAnimal);
		return strayAnimal;
	}
	
	
//	public StraySightLocation addition()
//	{
//		
//	}

}
