package com.spring.boot.interview.springbootinterview.controllers;

import com.spring.boot.interview.springbootinterview.dto.requests.CityRequest;
import com.spring.boot.interview.springbootinterview.dto.responses.GenericResponseImpl;
import com.spring.boot.interview.springbootinterview.entities.City;
import com.spring.boot.interview.springbootinterview.services.CityService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "cities")
public class CityController extends GenericControllerImpl<City, CityRequest, GenericResponseImpl<City>> {
	
	private CityService service;

	public CityController(CityService cityService) {
		super(cityService);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/findByName/{name}")
	public City findById(@PathVariable("name") String name) {
		return this.service.findByName(name);
	}
	
}
