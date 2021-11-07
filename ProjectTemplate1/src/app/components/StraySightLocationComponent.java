package app.components;

import java.util.List;

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
		Location locationData = findLocation(data);
		Sighting newSighting = addSighting(data, newIDAnimal.getId(),locationData);
		
		Sighting newIDSight = sightingRepository.save(newSighting);
		
		System.out.println("TEST: "+newIDAnimal.getId()+" New Sight: "+newIDSight.getId());
		return "Animal ID:"+newIDAnimal;	
		
	} 
	
	// select specific place
	public Location findLocation(StraySightLocation place) {
		Location l= locationRepository.findBylocation_name(place.getLocation());
		if(l==null) {
			Location newLocation = new Location();
			newLocation.setLatitude(place.getLatitude());
			newLocation.setLongitude(place.getLongitude());
			newLocation.setLocation_name(place.getLocation());			
			return locationRepository.save(newLocation);
		}
		else {
			return l;
		}
	}
	
	
	public StrayAnimal addAnimal(StraySightLocation data) {
		StrayAnimal strayAnimal = new StrayAnimal();
		strayAnimal.setType(data.getTypeOfAnimal());
		strayAnimal.setColor(data.getColor());
		strayAnimal.setDescription(data.getAnimalDescription());
		strayAnimal.setNeutered(data.getNeutered());		
		return strayAnimal;		
	}
	
	public List<StrayAnimal> selectNeutered() {
		List<StrayAnimal> strayAnimalNeutered  = strayAnimalRepository.findByNeutered();
		return strayAnimalNeutered;
	}
	
	public List<StrayAnimal> selectType(String type) {
		List<StrayAnimal> strayAnimalType  = strayAnimalRepository.findByType(type);
		return strayAnimalType;
	}
	
	public Sighting addSighting(StraySightLocation data, Long animalId, Location locationData ) {
		Sighting sighting = new Sighting();
		sighting.setAnimalId(animalId);
		sighting.setComment(data.getComment());
		sighting.setLatitude(locationData.getLatitude());
		sighting.setLongitude(locationData.getLongitude());
		sighting.setLocation(locationData.getLocation_name());
		return sighting;
	}
	
	

	
	
}

