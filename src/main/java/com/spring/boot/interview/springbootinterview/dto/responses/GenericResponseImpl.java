package com.spring.boot.interview.springbootinterview.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenericResponseImpl<T> implements GenericResponse<T> {

    private Long id;

}
