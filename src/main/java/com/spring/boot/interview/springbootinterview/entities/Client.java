package com.spring.boot.interview.springbootinterview.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity(name = "clients")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "full_name")
	private String fullName;
	
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	
	private int age;
	
	@OneToOne
	@JoinColumn(nullable = true)
	private City city;

}
