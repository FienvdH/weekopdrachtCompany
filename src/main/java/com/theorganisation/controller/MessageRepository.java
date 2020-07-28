package com.theorganisation.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.theorganisation.domain.*;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {

}
