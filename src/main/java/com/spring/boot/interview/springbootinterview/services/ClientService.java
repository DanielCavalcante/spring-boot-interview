package com.spring.boot.interview.springbootinterview.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.spring.boot.interview.springbootinterview.dto.requests.ClientRequest;
import com.spring.boot.interview.springbootinterview.dto.responses.GenericResponseImpl;
import com.spring.boot.interview.springbootinterview.entities.Client;
import com.spring.boot.interview.springbootinterview.mappers.ClientMapper;
import com.spring.boot.interview.springbootinterview.repositories.ClientRepository;

@Service
public class ClientService extends GenericServiceImpl<Client, ClientRequest, GenericResponseImpl<Client>> {

	public ClientService(ClientRepository clientRepository,
                         ClientMapper clientMapper) {
		super(clientRepository, clientMapper);
	}
	
	private ClientRepository getRepository() {
		return (ClientRepository) genericRepository;
	}
	
	public Client findByFullName(String name) {
		return this
				.getRepository()
				.findByFullName(name)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Client not found."));
	}

	public List<Client> findByFullNameContains(String name) {
		return this.getRepository().findByFullNameContains(name);
	}

}
