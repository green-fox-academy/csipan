package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.services.DoubleService;
import com.greenfoxacademy.rest.services.ErrorMessagesService;
import com.greenfoxacademy.rest.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  private DoubleService doubleService;
  private GreetingService greetingService;
  private ErrorMessagesService errorMessagesService;

  @Autowired
  public MainRestController(DoubleService doubleService, GreetingService greetingService, ErrorMessagesService errorMessagesService) {
    this.doubleService = doubleService;
    this.greetingService = greetingService;
    this.errorMessagesService = errorMessagesService;
  }

  @GetMapping(value = "/doubling")
  public ResponseEntity<?> doubling(@RequestParam(value = "input", required = false) Long received) {
    if (received == null) {
      return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Please provide an input!");
    } else {
      doubleService.setReceived(received);
      doubleService.getResult();
      return ResponseEntity.ok(doubleService.getDoubling());
    }
  }

  @GetMapping(value = "/greeter")
  public Object greeting(@RequestParam(value = "name", required = false) String name,
                                    @RequestParam(value = "title", required = false) String title) {
    if (name == null && title == null) {
      errorMessagesService.setMessage("Please provide a name and a title!");
      return errorMessagesService.getErrorMessages();
    } else if (name == null) {
      errorMessagesService.setMessage("Please provide a name!");
      return errorMessagesService.getErrorMessages();
    } else if (title == null) {
      errorMessagesService.setMessage("Please provide a title!");
      return errorMessagesService.getErrorMessages();
    } else {
      greetingService.generateMessage(name, title);
      return greetingService.getGreeting();
    }
  }
}
