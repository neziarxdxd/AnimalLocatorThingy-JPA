package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import app.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
	@Query("SELECT l FROM Location l WHERE l.location_name = :locationName")
	public Location findBylocation_name(@Param("locationName") String location_name);
}

	

