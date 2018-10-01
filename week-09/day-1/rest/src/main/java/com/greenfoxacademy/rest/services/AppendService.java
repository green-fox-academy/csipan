package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.modells.AppendA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppendService {

  private AppendA appendA;

  @Autowired

  public AppendService(AppendA appendA) {
    this.appendA = appendA;
  }

  public void generateWord(String word) {
    appendA.setAppendLetters(word + "a");
  }

  public AppendA getAppendA() {
    return appendA;
  }

  public void setAppendA(AppendA appendA) {
    this.appendA = appendA;
  }
}
