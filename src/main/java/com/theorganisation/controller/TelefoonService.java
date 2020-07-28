package com.theorganisation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.theorganisation.domain.*;

@Service
@Transactional
public class TelefoonService {
	@Autowired
	TelefoonRepository telefoonrepository;
	
	public Telefoon addTelefoon(Telefoon telefoon) {
		System.out.println("Telefoon toegevoegd aan database");
		return telefoonrepository.save(telefoon);
	}
}
