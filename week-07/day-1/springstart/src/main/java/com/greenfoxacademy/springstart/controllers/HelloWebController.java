package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  private static AtomicLong atomicLong = new AtomicLong(1);

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(value = "name") String name) {
    model.addAttribute("name", name);
    model.addAttribute("loaded", atomicLong.getAndIncrement());
    return "greeting";
  }
}
