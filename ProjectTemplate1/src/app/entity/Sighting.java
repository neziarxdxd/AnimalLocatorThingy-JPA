package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Sighting {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  // autoincrement
	@Column
	@NotNull(message="Name must be valid")
	private Long id;
	
	@Column
	@NotNull(message="Name must be valid")
	private Long animalId;
	
	@Column
	private String location;
	@Column
	private Double latitude;
	@Column
	private Double longitude;
	@Column
	private String comment;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getAnimalId() {
		return animalId;
	}


	public void setAnimalId(Long animalId) {
		this.animalId = animalId;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Double getLatitude() {
		return latitude;
	}


	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}


	public Double getLongitude() {
		return longitude;
	}


	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	@Override
	public String toString() {
		return "Sighting [id=" + id + ", animalId=" + animalId + ", location=" + location + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", comment=" + comment + "]";
	}
	
	

}
