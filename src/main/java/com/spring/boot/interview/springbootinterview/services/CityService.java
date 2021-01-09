package com.spring.boot.interview.springbootinterview.services;

import org.springframework.stereotype.Service;

import com.spring.boot.interview.springbootinterview.dto.requests.CityRequest;
import com.spring.boot.interview.springbootinterview.dto.responses.GenericResponseImpl;
import com.spring.boot.interview.springbootinterview.entities.City;
import com.spring.boot.interview.springbootinterview.mappers.CityMapper;
import com.spring.boot.interview.springbootinterview.repositories.CityRepository;

@Service
public class CityService extends GenericServiceImpl<City, CityRequest, GenericResponseImpl<City>> {
	
	private CityRepository cityRepository;

	public CityService(CityRepository cityRepository,
                       CityMapper cityMapper) {
		super(cityRepository, cityMapper);
	}
	
	public City findByName(String name) {
		return this.cityRepository.findByName(name);
	}

}
