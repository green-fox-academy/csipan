package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.modells.Result;
import com.greenfoxacademy.rest.modells.Until;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoUntilService {

  private Until until;
  private Result result;

  @Autowired
  public DoUntilService(Until until, Result result) {
    this.until = until;
    this.result = result;
  }

  public void actionType(String action, Until until) {
    if (action.equals("sum")) {
      sum(until);
    }
    if (action.equals("factor")) {
      factorial(until);
    }
  }

  public void sum(Until until) {
    long sum = 0;
    for (int i = 0; i < until.getUntil() ; i++) {
      sum += i;
    }
    result.setResult(sum);
  }

  public void factorial(Until until) {
    long factorial = 1;
    for (int i = 1; i < until.getUntil() ; i++) {
      factorial += factorial * i;
    }
    result.setResult(factorial);
  }

  public Until getUntil() {
    return until;
  }

  public Result getResult() {
    return result;
  }

  public void setUntil(Until until) {
    this.until = until;
  }

  public void setResult(Result result) {
    this.result = result;
  }
}
