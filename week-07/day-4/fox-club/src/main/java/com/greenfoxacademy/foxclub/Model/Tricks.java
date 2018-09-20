package com.greenfoxacademy.foxclub.Model;

import org.springframework.stereotype.Component;

@Component
public class Tricks {

  private String name;

  public Tricks() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
