package com.spring.boot.interview.springbootinterview.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.interview.springbootinterview.dto.requests.ClientRequest;
import com.spring.boot.interview.springbootinterview.dto.responses.GenericResponseImpl;
import com.spring.boot.interview.springbootinterview.entities.Client;
import com.spring.boot.interview.springbootinterview.services.ClientService;

@RestController
@RequestMapping(value = "clients")
public class ClientController extends GenericControllerImpl<Client, ClientRequest, GenericResponseImpl<Client>> {

	public ClientController(ClientService clientService) {
		super(clientService);
	}

	private ClientService getService() {
		return (ClientService) genericService;
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/search")
	public Client findByFullName(@RequestParam("name") String name) {
		return this.getService().findByFullName(name);
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/search/list")
	public List<Client> findByNameContains(@RequestParam("name") String name) {
		return this.getService().findByFullNameContains(name);
	}

}
