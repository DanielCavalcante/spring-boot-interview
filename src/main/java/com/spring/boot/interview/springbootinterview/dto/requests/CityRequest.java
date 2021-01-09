package com.spring.boot.interview.springbootinterview.dto.requests;

import com.spring.boot.interview.springbootinterview.enums.StateEnum;
import lombok.Data;

@Data
public class CityRequest {

    private String name;

    private StateEnum state;

}
