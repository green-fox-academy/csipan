package com.greenfoxacademy.finder.finder.model;

import org.springframework.stereotype.Component;

/**
 * Created by aze on 25/10/17.
 */

@Component
public class User {
  private String firstName;
  private String lastName;

  public User() {
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}

