package com.spring.boot.interview.springbootinterview.services;

import java.util.List;

public interface GenericService<T, U, V> {
	
	void add(List<U> list);
	V add(U object);
	T findById(Long id);
	List<T> findAll();
	void update(T object);
	void remove(Long id);

}
