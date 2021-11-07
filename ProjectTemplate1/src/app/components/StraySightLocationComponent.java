package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Location;
import app.entity.Sighting;
import app.entity.StrayAnimal;
import app.entity.StraySightLocation;
import app.repository.LocationRepository;
import app.repository.SightingRepository;
import app.repository.StrayAnimalRepository;

@Component
public class StraySightLocationComponent {

	@Autowired
	StrayAnimalRepository strayAnimalRepository;
	@Autowired
	SightingRepository sightingRepository;
	@Autowired
	LocationRepository locationRepository;
	
	
	public String addStraySight(StraySightLocation data) {
			// TODO: Add New Location when location doesn't exist
		StrayAnimal newAnimal = addAnimal(data);
		StrayAnimal newIDAnimal = strayAnimalRepository.save(newAnimal);
		//Location locationData = findLocationExist(data);
		//Sighting newSighting = addSighting(data, newIDAnimal.getId(),locationData);
		Sighting newSighting = addSightingTEST(data, newIDAnimal.getId());
		Sighting newIDSight = sightingRepository.save(newSighting);
		
		System.out.println("TEST: "+newIDAnimal.getId()+" New Sight: "+newIDSight.getId());
		return "Animal ID:"+newIDAnimal;	
		
	} 
	
	public Location testFIND(StraySightLocation place) {
		Location findLocation = new Location();
		findLocation.setLocation_name(place.getLocation());
		return findLocation;
	}
	
	
	public StrayAnimal addAnimal(StraySightLocation data) {
		StrayAnimal strayAnimal = new StrayAnimal();
		strayAnimal.setType(data.getTypeOfAnimal());
		strayAnimal.setColor(data.getColor());
		strayAnimal.setDescription(data.getAnimalDescription());
		strayAnimal.setNeutered(data.getNeutered());		
		return strayAnimal;		
	}

	public Sighting addSightingTEST(StraySightLocation data, Long animalId ) {
		Sighting sighting = new Sighting();
		sighting.setAnimalId(animalId);
		sighting.setComment(data.getComment());
		sighting.setLatitude(data.getLatitude());
		sighting.setLongitude(data.getLongitude());
		sighting.setLocation(data.getLocation());
		return sighting;
	}
	
	/**
	public Sighting addSighting(StraySightLocation data, Long animalId, Location locationData ) {
		Sighting sighting = new Sighting();
		sighting.setAnimalId(animalId);
		sighting.setComment(data.getComment());
		sighting.setLatitude(locationData.getLatitude());
		sighting.setLongitude(locationData.getLongitude());
		sighting.setLocation(locationData.getLocation_name());
		return sighting;
	}**/
	
	
	@SuppressWarnings("null")
	public Location findLocationExist(StraySightLocation place) {
		Location location = locationRepository.findBylocation_name(place.getLocation());
		
		if(location!=null) {
			System.out.println(location.getLongitude());
			System.out.println(location.toString());
			return location;			
		}
		else {
			System.out.println(location.getLocation_name());
			return addNewLocation(place);	
				
		}	
	
		
			
		
	}
	
	public Location addNewLocation(StraySightLocation data) {
		LocationInitializer location = new LocationInitializer();
		Location newLocation = location.newLocation(data.getLocation(), data.getLatitude(), data.getLongitude());
		return newLocation;
	}
}

