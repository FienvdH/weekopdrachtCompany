package com.theorganisation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.theorganisation.domain.*;

@Service
@Transactional
public class MessageService {

	@Autowired
	MessageRepository messagerepository;
	
	public Message addMessage(Message message) {
		System.out.println("Message toegevoegd aan database");
		return messagerepository.save(message);
	}
	
}
