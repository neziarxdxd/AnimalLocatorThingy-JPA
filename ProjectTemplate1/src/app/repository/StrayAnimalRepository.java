package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import app.entity.StrayAnimal;

@Repository
public interface StrayAnimalRepository extends JpaRepository<StrayAnimal, Long> {
	@Query("SELECT l FROM StrayAnimal l WHERE l.neutered = false")
	public List<StrayAnimal> findByNeutered();
	
	@Query("SELECT l FROM StrayAnimal l WHERE l.type= :type")
	public List<StrayAnimal> findByType(@Param("type") String type);
}
