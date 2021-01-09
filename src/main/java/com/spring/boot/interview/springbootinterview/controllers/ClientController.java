package com.spring.boot.interview.springbootinterview.controllers;

import com.spring.boot.interview.springbootinterview.dto.requests.ClientRequest;
import com.spring.boot.interview.springbootinterview.dto.responses.GenericResponseImpl;
import com.spring.boot.interview.springbootinterview.entities.Client;
import com.spring.boot.interview.springbootinterview.services.ClientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "clients")
public class ClientController extends GenericControllerImpl<Client, ClientRequest, GenericResponseImpl<Client>> {

	public ClientController(ClientService clientService) {
		super(clientService);
	}
	
}
