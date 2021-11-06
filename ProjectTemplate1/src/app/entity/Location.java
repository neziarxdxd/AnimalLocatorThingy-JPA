package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  // autoincrement
	@Column
	Long id;
	
	@Column
	private String location_name;
	
	@Column
	Double Latitude;
	
	@Column
	Double Longitude;

	
}
