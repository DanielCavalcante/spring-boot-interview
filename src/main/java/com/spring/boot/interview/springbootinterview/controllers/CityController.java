package com.spring.boot.interview.springbootinterview.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.interview.springbootinterview.dto.requests.CityRequest;
import com.spring.boot.interview.springbootinterview.dto.responses.GenericResponseImpl;
import com.spring.boot.interview.springbootinterview.entities.City;
import com.spring.boot.interview.springbootinterview.services.CityService;

@RestController
@RequestMapping(value = "cities")
public class CityController extends GenericControllerImpl<City, CityRequest, GenericResponseImpl<City>> {

	public CityController(CityService cityService) {
		super(cityService);
	}

	private CityService getService() {
		return (CityService) genericService;
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/search")
	public City findByName(@RequestParam("name") String name) {
		return this.getService().findByName(name);
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/search/list")
	public List<City> findByNameContains(@RequestParam("name") String name) {
		return this.getService().findByNameContains(name);
	}

}
