package com.greenfoxacademy.groot.service;

import com.greenfoxacademy.groot.model.ErrorMessage;
import com.greenfoxacademy.groot.model.Message;
import org.springframework.stereotype.Service;

@Service
public class GuardianServiceImp implements GuardianService{

  @Override
  public Message getMessage(String message) {
    return new Message(message, "I am Groot!");
  }

  @Override
  public ErrorMessage getErrorMessage() {
    return new ErrorMessage("I am Groot!");
  }




}
