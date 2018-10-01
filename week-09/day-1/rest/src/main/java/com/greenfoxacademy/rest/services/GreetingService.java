package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.modells.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

  private Greeting greeting;

  @Autowired
  public GreetingService(Greeting greeting) {
    this.greeting = greeting;
  }

  public void generateMessage(String name, String title) {
    greeting.setWelcome_message("Oh, hi there " + name + ", my dear " + title);
  }

  public Greeting getGreeting() {
    return greeting;
  }

  public void setGreeting(Greeting greeting) {
    this.greeting = greeting;
  }
}
