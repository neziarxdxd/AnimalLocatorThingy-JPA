package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  // autoincrement
	@Column
	@NotNull(message="Name must be valid")
	private Long id;
	
	@Column
	private String location_name;
	
	@Column
	private Double latitude;
	
	@Column
	private Double longitude;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocation_name() {
		return location_name;
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
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

	@Override
	public String toString() {
		return "Location [id=" + id + ", location_name=" + location_name + ", latitude=" + latitude + ", longitude="
				+ longitude + "]";
	}
	
	
	
	
	
	
	

	
}
