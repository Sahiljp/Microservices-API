package com.api.filmsmicrosevices;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.api.filmsmicrosevices.Entity.Films;


public interface FilmsRepository extends MongoRepository<Films, Long> {
	
	@Query("SELECT m FROM Films m WHERE m.id=:id")
	List<Films> findByFilmsid(Long id);
}



