package com.greenfoxacademy.hellobeanworld.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class BlueColor implements MyColor {

  Printer printer;

  @Autowired
  public BlueColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("The sky is blueeee :)");
  }
}
