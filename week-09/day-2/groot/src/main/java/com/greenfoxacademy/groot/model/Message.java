package com.greenfoxacademy.groot.model;

import org.springframework.stereotype.Component;

@Component
public class Message {

  private String received;
  private String translated;

  public Message() {
  }

  public Message(String received, String translated) {
    this.received = received;
    this.translated = translated;
  }

  public String getReceived() {
    return received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
