package com.greenfoxacademy.todolisting.controllers;

import com.greenfoxacademy.todolisting.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam (value = "isActive", required = false) String active) {
    if (active == null || active.equals("false")) {
      model.addAttribute("todolist", todoRepository.findAll());
    } else {
      model.addAttribute("todolist", todoRepository.findAllByDoneFalse());
    }
    return "todoslist";
  }


}
