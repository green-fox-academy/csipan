package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.modells.ErrorMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ErrorMessagesService {

  private ErrorMessages errorMessages;

  @Autowired
  public ErrorMessagesService(ErrorMessages errorMessages) {
    this.errorMessages = errorMessages;
  }

  public void setMessage(String message) {
    errorMessages.setError(message);
  }

  public ErrorMessages getErrorMessages() {
    return errorMessages;
  }

  public void setErrorMessages(ErrorMessages errorMessages) {
    this.errorMessages = errorMessages;
  }
}

