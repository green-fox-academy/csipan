package com.greenfoxacademy.foxclub.Controller;

import com.greenfoxacademy.foxclub.Model.FoxPack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private FoxPack foxes;

  @Autowired
  public MainController(FoxPack foxes) {
    this.foxes = foxes;
  }

  @GetMapping(value = "/")
  public String mainPage(@RequestParam (required = false, value = "name") String name, Model model) {
    if (name == null) {
      return "redirect:/login";
    }
    if (foxes.isOrNotTheFoxInThePack(name)) {
      model.addAttribute("foxName", name);
      model.addAttribute("foxFood", name);
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
    foxes.createFoxByName(name);
    return "redirect:/?name=" + name;
  }
}
