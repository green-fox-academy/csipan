package com.greenfoxacademy.todolisting.controllers;

import com.greenfoxacademy.todolisting.models.Assignee;
import com.greenfoxacademy.todolisting.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

  private AssigneeService assigneeService;

  @Autowired
  public AssigneeController(AssigneeService assigneeService) {
    this.assigneeService = assigneeService;
  }

  @GetMapping(value = "/")
  public String assigneeList(Model model) {
    model.addAttribute("assigneelist", assigneeService.findAll());
    return "assigneelist";
  }

  @GetMapping(value = "/add")
  public String addNewAssignee() {
    return "addAssignee";
  }

  @PostMapping(value = "/add")
  public String addNewAssignee(Model model, @RequestParam(value = "name", required = false) String name, @RequestParam(value = "email", required = false) String email) {
    assigneeService.addNewAssignee(model, name, email);
    return "redirect:";
  }
}
