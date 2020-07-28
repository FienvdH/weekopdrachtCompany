package com.theorganisation.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theorganisation.controller.*;
import com.theorganisation.domain.*;

@RestController
@RequestMapping("/api/message")
public class MessageEndpoint {
	
	@Autowired
	MessageService messageservice;

	@PostMapping("/new")
	public Message addMessage(@RequestBody Message message) {
		return messageservice.addMessage(message);
	}

}
