package app.components;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Location;
import app.repository.LocationRepository;

@Component
public class LocationInitializer {
	
	@Autowired
	private LocationRepository locationRepository;
	
	
	
	@PostConstruct
	public void init()
	{
		if (locationRepository.count()==0)
		{
			Location locationPlace = insertLocation("idk the place", 14.639187, 121.079384);
			locationRepository.save(locationPlace);
		}
	}
	

	
	
	public Location insertLocation(String location_name,Double latitude, Double longitude){		
		Location location = new Location();	
		location.setLocation_name(location_name);
		location.setLatitude(latitude);
		location.setLongitude(longitude);
		return location;
	}
}
