package com.spring.boot.interview.springbootinterview.mappers;

import com.spring.boot.interview.springbootinterview.dto.requests.CityRequest;
import com.spring.boot.interview.springbootinterview.dto.responses.GenericResponseImpl;
import com.spring.boot.interview.springbootinterview.entities.City;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CityMapper extends GenericMapper<City, CityRequest, GenericResponseImpl<City>> {
}
