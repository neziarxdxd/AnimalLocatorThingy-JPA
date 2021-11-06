package app.rest.controllers;

import javax.ws.rs.Consumes;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.components.StraySightLocationComponent;
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
//	public StraySightLocation addition()
//	{
//		
//	}

}
