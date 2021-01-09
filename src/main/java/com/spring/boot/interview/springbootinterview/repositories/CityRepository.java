package com.spring.boot.interview.springbootinterview.repositories;

import java.util.List;
import java.util.Optional;

import com.spring.boot.interview.springbootinterview.entities.City;

public interface CityRepository extends GenericRepository<City> {

	Optional<City> findByName(String name);

    List<City> findByNameContains(String name);
	
}
