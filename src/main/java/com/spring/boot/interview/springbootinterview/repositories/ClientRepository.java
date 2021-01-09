package com.spring.boot.interview.springbootinterview.repositories;

import java.util.List;
import java.util.Optional;

import com.spring.boot.interview.springbootinterview.entities.Client;

public interface ClientRepository extends GenericRepository<Client> {
	
	Optional<Client> findByFullName(String fullName);
	
	List<Client> findByFullNameContains(String fullName);
	
}
