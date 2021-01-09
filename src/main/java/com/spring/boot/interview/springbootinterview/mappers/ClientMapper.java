package com.spring.boot.interview.springbootinterview.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.spring.boot.interview.springbootinterview.dto.requests.ClientRequest;
import com.spring.boot.interview.springbootinterview.dto.responses.GenericResponseImpl;
import com.spring.boot.interview.springbootinterview.entities.Client;

@Mapper(componentModel = "spring")

public interface ClientMapper extends GenericMapper<Client, ClientRequest, GenericResponseImpl<Client>> {

    @Mapping(source = "cityId", target = "city.id")
    Client requestToEntity(ClientRequest genericRequest);

}
