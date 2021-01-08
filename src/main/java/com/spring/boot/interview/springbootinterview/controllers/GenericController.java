package com.spring.boot.interview.springbootinterview.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface GenericController<T> {
	
	void addList(List<T> list);
	void add(T object);
	ResponseEntity<T> findById(Long id);
	void update(T object);
	void remove(Long id);

}
