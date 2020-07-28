package com.theorganisation.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theorganisation.controller.*;
import com.theorganisation.domain.*;

@RestController
@RequestMapping("/api/telefoon")
public class TelefoonEndpoint {
	
	@Autowired
	TelefoonService telefoonService;
	
	@PostMapping("/new")
	public Telefoon addTelefoon(@RequestBody Telefoon telefoon) {
		return telefoonService.addTelefoon(telefoon);
	}
}
