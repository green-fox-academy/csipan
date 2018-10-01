package com.greenfoxacademy.rest.modells;

import org.springframework.stereotype.Component;

@Component
public class Doubling {

  private long received;
  private long result;

  public Doubling() {
  }

  public long getReceived() {
    return received;
  }

  public long getResult() {
    return result;
  }

  public void setReceived(long received) {
    this.received = received;
  }

  public void setResult(long result) {
    this.result = result;
  }
}
