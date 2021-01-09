package com.spring.boot.interview.springbootinterview.repositories;

import com.spring.boot.interview.springbootinterview.entities.City;

public interface CityRepository extends GenericRepository<City> {

	public City findByName(String name);
	
}
