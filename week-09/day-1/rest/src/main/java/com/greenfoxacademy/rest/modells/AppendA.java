package com.greenfoxacademy.rest.modells;

import org.springframework.stereotype.Component;

@Component
public class AppendA {

  private String appendLetters;

  public AppendA() {
  }

  public String getAppendLetters() {
    return appendLetters;
  }

  public void setAppendLetters(String appendLetters) {
    this.appendLetters = appendLetters;
  }
}
