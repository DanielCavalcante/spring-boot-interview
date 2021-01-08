package com.spring.boot.interview.springbootinterview.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.interview.springbootinterview.entities.City;
import com.spring.boot.interview.springbootinterview.repositories.CityRepository;

@Service
public class CityService extends GenericServiceImpl<City> {

	public CityService(CityRepository cityRepository) {
		super(cityRepository); 
	}
	
	public List<City> findAll() {
		return this.genericRepository.findAll();
	}

}
