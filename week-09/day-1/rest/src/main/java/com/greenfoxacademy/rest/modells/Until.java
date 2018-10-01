package com.greenfoxacademy.rest.modells;

import org.springframework.stereotype.Component;

@Component
public class Until {

  private long until;

  public Until() {
  }

  public long getUntil() {
    return until;
  }

  public void setUntil(long until) {
    this.until = until;
  }
}
