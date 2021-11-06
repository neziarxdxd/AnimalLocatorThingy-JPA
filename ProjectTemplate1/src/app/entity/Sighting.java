package app.entity;

import javax.persistence.Entity;

@Entity
public class Sighting {

	private Long id;
	private Long animalId;
	private String location;
	private Double latitude;
	private Double longitude;
	private String comment;

}
