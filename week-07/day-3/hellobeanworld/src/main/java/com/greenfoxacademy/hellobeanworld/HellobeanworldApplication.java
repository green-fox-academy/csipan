package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.Service.MyColor;
import com.greenfoxacademy.hellobeanworld.Service.Printer;
import com.greenfoxacademy.hellobeanworld.Service.RedColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

  Printer printer;
  MyColor color;

  @Autowired
  public HellobeanworldApplication(Printer printer, MyColor color) {
    this.printer = printer;
    this.color = color;
  }

  public static void main(String[] args) {
    SpringApplication.run(HellobeanworldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("Hi, I am your printer :D");
    color.printColor();
  }
}
