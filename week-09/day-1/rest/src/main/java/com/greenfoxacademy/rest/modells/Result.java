package com.greenfoxacademy.rest.modells;

import org.springframework.stereotype.Component;

@Component
public class Result {

  private long result;

  public Result() {
  }

  public long getResult() {
    return result;
  }

  public void setResult(long result) {
    this.result = result;
  }
}
