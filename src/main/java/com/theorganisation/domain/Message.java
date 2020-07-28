package com.theorganisation.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity

public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String message;
	
}
