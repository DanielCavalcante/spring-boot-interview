package com.spring.boot.interview.springbootinterview.services;

import java.util.ArrayList;
import java.util.List;
import com.spring.boot.interview.springbootinterview.mappers.GenericMapper;
import com.spring.boot.interview.springbootinterview.repositories.GenericRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GenericServiceImpl<T, U, V> implements GenericService<T, U, V> {
	
	protected final GenericRepository<T> genericRepository;
	protected final GenericMapper<T, U, V> genericMapper;

	public GenericServiceImpl(GenericRepository<T> genericRepository,
							  GenericMapper<T, U, V> genericMapper) {
		this.genericRepository = genericRepository;
		this.genericMapper = genericMapper;
	}
	
	@Override
	public void add(List<U> list) {
		List<T> lista = new ArrayList<>();
		for (U genericRequest: list)
			genericMapper.requestToEntity(genericRequest);
		this.genericRepository.saveAll(lista);
	}

	@Override
	public V add(U object) {
		T obj = genericMapper.requestToEntity(object);
		return genericMapper.entityToResponse(this.genericRepository.save(obj));
	}

	@Override
	public T findById(Long id) {
		return this
				.genericRepository
				.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Object not found."));
	}

	@Override
	public List<T> findAll() {
		return this.genericRepository.findAll();
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
