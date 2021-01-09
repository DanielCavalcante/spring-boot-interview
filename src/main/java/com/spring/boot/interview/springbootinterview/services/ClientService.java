package com.spring.boot.interview.springbootinterview.services;

import com.spring.boot.interview.springbootinterview.dto.requests.ClientRequest;
import com.spring.boot.interview.springbootinterview.dto.responses.GenericResponseImpl;
import com.spring.boot.interview.springbootinterview.entities.Client;
import com.spring.boot.interview.springbootinterview.mappers.ClientMapper;
import com.spring.boot.interview.springbootinterview.repositories.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService extends GenericServiceImpl<Client, ClientRequest, GenericResponseImpl<Client>> {

	public ClientService(ClientRepository clientRepository,
                         ClientMapper clientMapper) {
		super(clientRepository, clientMapper);
	}

}
