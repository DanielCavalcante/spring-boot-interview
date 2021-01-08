package com.spring.boot.interview.springbootinterview.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.spring.boot.interview.springbootinterview.enums.StateEnum;

import lombok.Data;

@Data
@Entity(name = "cities")
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@Enumerated(EnumType.STRING)
	private StateEnum state;

}
