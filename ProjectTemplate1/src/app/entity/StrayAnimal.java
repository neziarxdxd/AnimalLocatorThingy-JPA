package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class StrayAnimal {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  // autoincrement
	@Column
	@NotNull(message="Name must be valid")
	private Long id;
	
	@Column
	private String type;
	
	@Column
	private String color;
	
	@Column
	private  Boolean neutered;
	
	@Column
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "StrayAnimal [id=" + id + ", type=" + type + ", color=" + color + ", neutered=" + neutered
				+ ", description=" + description + "]";
	}

}
