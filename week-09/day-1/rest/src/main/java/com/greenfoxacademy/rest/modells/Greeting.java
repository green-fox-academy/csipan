package com.greenfoxacademy.rest.modells;

import org.springframework.stereotype.Component;

@Component
public class Greeting {

  private String welcome_message;

  public Greeting() {
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String message) {
    this.welcome_message = message;
  }
}
