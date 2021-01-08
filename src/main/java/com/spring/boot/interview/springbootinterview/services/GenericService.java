package com.spring.boot.interview.springbootinterview.services;

import java.util.List;
import java.util.Optional;

public interface GenericService<T> {
	
	void add(List<T> list);
	void add(T object);
	Optional<T> findById(Long id);
	void update(T object);
	void remove(Long id);

}
