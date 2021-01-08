package com.spring.boot.interview.springbootinterview.services;

import java.util.List;
import java.util.Optional;

import com.spring.boot.interview.springbootinterview.repositories.GenericRepository;

public class GenericServiceImpl<T> implements GenericService<T> {
	
	protected GenericRepository<T> genericRepository;

	public GenericServiceImpl(GenericRepository<T> genericRepository) {
        this.genericRepository = genericRepository;
    }
	
	@Override
	public void add(List<T> list) {
		this.genericRepository.saveAll(list);
	}

	@Override
	public void add(T object) {
		this.genericRepository.save(object);
	}

	@Override
	public Optional<T> findById(Long id) {
		return this.genericRepository.findById(id);
	}

	@Override
	public void update(T object) {
		this.genericRepository.save(object);
	}

	@Override
	public void remove(Long id) {
		this.genericRepository.deleteById(id);
	}

}
