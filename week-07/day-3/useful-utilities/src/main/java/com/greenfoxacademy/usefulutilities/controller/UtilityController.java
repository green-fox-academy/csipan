package com.greenfoxacademy.usefulutilities.controller;

import com.greenfoxacademy.usefulutilities.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

  UtilityService utilityService;

  @Autowired
  public UtilityController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping(value = "/useful")
  public String showColoredBackground() {
    return "useful";
  }

  @ GetMapping(value = "/useful/colored")
  public String showRandomColorBackground(Model model) {
    model.addAttribute("backgroundColor", utilityService.randomColor());
    return "colored";
  }

  @GetMapping(value = "/useful/email")
  public String validateEmail(@RequestParam(value = "email") String email, Model model) {
    model.addAttribute("validateEmail", utilityService.validateEmail(email));
    return "email";
  }

  @GetMapping(value = "/useful/encoder")
  public String encoder(@RequestParam(value = "text") String text, @RequestParam(value = "number") int number, Model model) {
    model.addAttribute("validateEncoder", utilityService.caesar(text, number));
    model.addAttribute("text", text);
    model.addAttribute("number", number);
    return "encoder";
  }

  @GetMapping(value = "/useful/decoder")
  public String decoder(@RequestParam(value = "text") String text, @RequestParam(value = "number") int number, Model model) {
    model.addAttribute("text", text);
    model.addAttribute("number", number);
    model.addAttribute("validateDecoder", utilityService.caesar(text, -number));
    return "decoder";
  }
}
