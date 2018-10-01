package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.modells.Until;
import com.greenfoxacademy.rest.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  private DoubleService doubleService;
  private GreetingService greetingService;
  private ErrorMessagesService errorMessagesService;
  private AppendService appendService;
  private DoUntilService doUntilService;

  @Autowired
  public MainRestController(DoubleService doubleService, GreetingService greetingService, ErrorMessagesService errorMessagesService,
                            AppendService appendService, DoUntilService doUntilService) {
    this.doubleService = doubleService;
    this.greetingService = greetingService;
    this.errorMessagesService = errorMessagesService;
    this.appendService = appendService;
    this.doUntilService = doUntilService;
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

  @GetMapping(value = "/appenda/{appendable}")
  public ResponseEntity<?> appending(@PathVariable(value = "appendable", required = false) String word) {
    if (word == null) {
      return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Please provide an input!");
    } else {
      appendService.generateWord(word);
      return ResponseEntity.ok(appendService.getAppendA());
    }
  }

  @PostMapping(value = "/dountil/{action}")
  public Object sumUntil(@RequestBody(required = false) Until until, @PathVariable(value = "action", required = false) String action) {
    if (action == null) {
      errorMessagesService.setMessage("Please provide a number!");
      return errorMessagesService.getErrorMessages();
    } else if (until == null) {
      errorMessagesService.setMessage("Please provide a number!");
      return errorMessagesService.getErrorMessages();
    } else {
      doUntilService.actionType(action, until);
      return doUntilService.getResult();
    }

  }
}
