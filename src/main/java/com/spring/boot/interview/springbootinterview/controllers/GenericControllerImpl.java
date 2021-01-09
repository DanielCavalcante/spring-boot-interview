package com.spring.boot.interview.springbootinterview.controllers;

import com.spring.boot.interview.springbootinterview.services.GenericService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GenericControllerImpl<T, U, V> implements GenericController<T, U, V> {
	
	protected GenericService<T, U, V> genericService;
	
	public GenericControllerImpl(GenericService<T, U, V> genericService) {
        this.genericService = genericService;
    }

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(name = "/addList")
	public void addList(List<U> list) {
		this.genericService.add(list);
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/create")
	public V add(@RequestBody U object) {
		return this.genericService.add(object);
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/{id}")
	public T findById(@PathVariable("id") Long id) {
		return this.genericService.findById(id);
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping
	public List<T> findAll() {
		return this.genericService.findAll();
	}

	@ResponseStatus(HttpStatus.ACCEPTED)
	@PutMapping
	public void update(@RequestBody T object) {
		this.genericService.update(object);
	}

	@ResponseStatus(HttpStatus.ACCEPTED)
	@DeleteMapping(value = "/{id}")
	public void remove(@PathVariable("id") Long id) {
		this.genericService.remove(id);
	}

}
