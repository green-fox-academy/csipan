package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping(value = "/greeting")
//  @RequestParam
  public Greeting greeting() {
    Greeting greeting = new Greeting(1, "Hello, World!");
//    return new Greeting(1, "Hello, World!");
    return greeting;
  }
}
