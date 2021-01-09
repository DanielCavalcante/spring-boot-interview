package com.spring.boot.interview.springbootinterview.controllers;

import java.util.List;

public interface GenericController<T, U, V> {

	void addList(List<U> list);
	V add(U object);
	T findById(Long id);
	List<T> findAll();
	void update(T object);
	void remove(Long id);

}
