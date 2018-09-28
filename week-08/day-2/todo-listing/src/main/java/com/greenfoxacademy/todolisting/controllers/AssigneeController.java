package com.greenfoxacademy.todolisting.controllers;

import com.greenfoxacademy.todolisting.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

  private AssigneeRepository assigneeRepository;

  @Autowired AssigneeController(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @GetMapping(value = "/")
  public String assigneList(Model model) {
    model.addAttribute("assigneelist", assigneeRepository.findAll());
    return "assigneelist";
  }
}
