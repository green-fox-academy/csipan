package com.greenfoxacademy.finder.finder.controller;

import com.greenfoxacademy.finder.finder.model.User;
import com.greenfoxacademy.finder.finder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
public class AppController {

  @Autowired
  UserService service;

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("user", new User());
    model.addAttribute("yolo", service.getAll());
    return "index";
  }

  @PostMapping("/")
  public String create(@ModelAttribute(value = "user") User user) {
    service.save(user);
    return "redirect:/";
  }
}