package com.spring.boot.interview.springbootinterview.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.spring.boot.interview.springbootinterview.services.GenericService;

public class GenericControllerImpl<T> implements GenericController<T> {
	
	protected GenericService<T> genericService;
	
	public GenericControllerImpl(GenericService<T> genericService) {
        this.genericService = genericService;
    }

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(name = "/addList")
	public void addList(List<T> list) {
		this.genericService.add(list);
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/create")
	public void add(T object) {
		this.genericService.add(object);
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/{id}")
	public ResponseEntity<T> findById(Long id) {
		T obj = this.genericService
                .findById(id)
                .orElseThrow();
        return ResponseEntity.ok(obj);
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PutMapping
	public void update(T object) {
		this.genericService.update(object);
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping(value = "/{id}")
	public void remove(Long id) {
		this.genericService.remove(id);
	}

}
