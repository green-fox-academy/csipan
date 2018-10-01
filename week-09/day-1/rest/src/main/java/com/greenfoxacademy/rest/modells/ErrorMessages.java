package com.greenfoxacademy.rest.modells;

import org.springframework.stereotype.Component;

@Component
public class ErrorMessages {

  private String error;

  public ErrorMessages() {
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}