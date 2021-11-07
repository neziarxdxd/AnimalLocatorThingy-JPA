package app.entity;

public class StraySightLocation {
	private String location;
	private Double latitude;
	private Double longitude;
	private String typeOfAnimal;
	private String color;
	private Boolean neutered;
	private String animalDescription;
	private String comment;
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
	public String getTypeOfAnimal() {
		return typeOfAnimal;
	}
	public void setTypeOfAnimal(String typeOfAnimal) {
		this.typeOfAnimal = typeOfAnimal;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean getNeutered() {
		return neutered;
	}
	public void setNeutered(Boolean neutered) {
		this.neutered = neutered;
	}
	public String getAnimalDescription() {
		return animalDescription;
	}
	public void setAnimalDescription(String animalDescription) {
		this.animalDescription = animalDescription;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
