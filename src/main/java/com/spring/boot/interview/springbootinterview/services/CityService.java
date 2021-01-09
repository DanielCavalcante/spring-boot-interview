package com.spring.boot.interview.springbootinterview.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.spring.boot.interview.springbootinterview.dto.requests.CityRequest;
import com.spring.boot.interview.springbootinterview.dto.responses.GenericResponseImpl;
import com.spring.boot.interview.springbootinterview.entities.City;
import com.spring.boot.interview.springbootinterview.mappers.CityMapper;
import com.spring.boot.interview.springbootinterview.repositories.CityRepository;

@Service
public class CityService extends GenericServiceImpl<City, CityRequest, GenericResponseImpl<City>> {

	public CityService(CityRepository cityRepository,
                       CityMapper cityMapper) {
		super(cityRepository, cityMapper);
	}
	
	private CityRepository getRepository() {
		return (CityRepository) genericRepository;
	}
	
	public City findByName(String name) {
		return this
				.getRepository()
				.findByName(name)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "City not found."));
	}

	public List<City> findByNameContains(String name) {
		return this.getRepository().findByNameContains(name);
	}

}
