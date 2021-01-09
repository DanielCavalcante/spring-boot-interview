package com.spring.boot.interview.springbootinterview.mappers;

public interface GenericMapper<T, U, V> {

    T requestToEntity(U genericRequest);

    V entityToResponse(T genericEntity);

}
