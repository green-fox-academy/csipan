package com.greenfoxacademy.todolisting.controllers;

import com.greenfoxacademy.todolisting.models.Assignee;
import com.greenfoxacademy.todolisting.models.Todo;
import com.greenfoxacademy.todolisting.services.AssigneeService;
import com.greenfoxacademy.todolisting.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoService todoService;
  private AssigneeService assigneeService;

  @Autowired
  public TodoController(TodoService todoService, AssigneeService assigneeService) {
    this.todoService = todoService;
    this.assigneeService = assigneeService;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(value = "isActive", required = false) String active) {
    todoService.listOfActivTodos(model, active);
    return "todoslist";
  }

  @GetMapping(value = "/add")
  public String addNewTodo() {
    return "add";
  }

  @PostMapping(value = "/add")
  public String addNewTodo(Model model, @RequestParam(value = "addNewTodo", required = false) String addNewTodo) {
    todoService.addNewTodo(model, addNewTodo);
    return "redirect:";
  }

  @PostMapping(value = "/removeTodo")
  public String removeTodo(@ModelAttribute(value = "remove") long id) {
    todoService.removeTodo(id);
    return "redirect:";
  }

  @GetMapping(value = "/{id}/edit")
  public String editTodo(Model model, @PathVariable(value = "id") long id) {
    model.addAttribute("assigneelist", assigneeService.findAll());
    todoService.editTodo(model, id);
    return "edit";
  }

  @PostMapping(value = "/{id}/edit")
  public String editTodo(@ModelAttribute(value = "editTodos") Todo todo,
                         @ModelAttribute(value = "assignees") Assignee assignee,
                         @PathVariable(value = "id") long id) {
    todoService.save(todoService.addAssigneeToTodo(assignee, id));
    return "redirect:/todo/";
  }

  @GetMapping(value = "/search")
  public String searchByTitle() {
    return "search";
  }

  @PostMapping(value = "/search")
  public String searchByTitle(Model model, @RequestParam(value = "searchByTitle", required = false) String searchTitle) {
    todoService.searchByTitle(model, searchTitle);
    return "todoslist";
  }
}
