package com.spring.boot.interview.springbootinterview.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.interview.springbootinterview.entities.City;
import com.spring.boot.interview.springbootinterview.services.CityService;
import com.spring.boot.interview.springbootinterview.services.GenericService;

@RestController
@RequestMapping(value = "cities")
public class CityController extends GenericControllerImpl<City> {
	
	private CityService cityService = (CityService) this.genericService;

	public CityController(GenericService<City> genericService, CityService cityService) {
		super(genericService);
		this.cityService = cityService;
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping(value = "/list")
	public List<City> list() {
		return this.cityService.findAll();
	}
	
}
