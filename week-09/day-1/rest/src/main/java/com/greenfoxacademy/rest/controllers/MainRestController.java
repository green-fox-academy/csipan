package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.services.DoubleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  private DoubleService doubleService;

  @Autowired
  public MainRestController(DoubleService doubleService) {
    this.doubleService = doubleService;
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
}
