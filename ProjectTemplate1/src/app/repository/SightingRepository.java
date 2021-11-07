package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.Sighting;


@Repository
public interface SightingRepository extends JpaRepository<Sighting, Long> {

}
