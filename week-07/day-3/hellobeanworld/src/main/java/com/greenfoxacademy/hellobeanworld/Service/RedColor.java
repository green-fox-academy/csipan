package com.greenfoxacademy.hellobeanworld.Service;

import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor{

  Printer printer;

  public RedColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("The tomato is reeeed :)");
  }
}
