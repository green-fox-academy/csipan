package com.greenfoxacademy.todolisting.controllers;

import com.greenfoxacademy.todolisting.models.Assignee;
import com.greenfoxacademy.todolisting.models.Todo;
import com.greenfoxacademy.todolisting.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping(value = "/removeAssignee")
  public String removeAssignee(@ModelAttribute(value = "remove") long id) {
    assigneeService.removeAssignee(id);
    return "redirect:/assignee/";
  }

  @GetMapping(value = "/{id}/editAssignee")
  public String editAssignee(Model model, @PathVariable(value = "id") long id) {
    assigneeService.editAssignee(model, id);
    return "editAssignee";
  }

  @PostMapping(value = "/{id}/editAssignee")
  public String editAssignee(@ModelAttribute(value = "editAssignee") Assignee assignee) {
    assigneeService.saveAssignee(assignee);
    return "redirect:/assignee/";
  }

  @GetMapping(value = "/searchAssignee")
  public String searchByAssignee() {
    return "searchAssignee";
  }

  @PostMapping(value = "/searchAssignee")
  public String searchByAssignee(Model model, @RequestParam(value = "searchByAssignee", required = false) String searchByAssignee) {
    assigneeService.searchByAssignee(model, searchByAssignee);
    return "assigneelist";
  }
}
