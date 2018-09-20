package com.greenfoxacademy.foxclub.Controller;

import com.greenfoxacademy.foxclub.Model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MainController {

  private Fox fox;

  @Autowired
  public MainController(Fox fox) {
    this.fox = fox;
  }

  @GetMapping(value = "/")
  public String mainPage(@RequestParam (required = false, value = "name") String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    }
    if (name.equals(fox.getName())) {
      model.addAttribute("foxName", fox.getName());
      model.addAttribute("foxFood", fox.getFood());
      return "index";
    } else {
      return "redirect:/login";
    }
  }

  @GetMapping(value = "/login")
  public String loginPage() {
    return "login";
  }

  @PostMapping(value = "/login")
  public String postFoxName(@ModelAttribute(value = "name") String name) {
    fox.setName(name);
    return "redirect:/?name=" + name;
  }
}
