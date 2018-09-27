package com.greenfoxacademy.todolisting.controllers;

import com.greenfoxacademy.todolisting.models.Todo;
import com.greenfoxacademy.todolisting.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(value = "isActive", required = false) String active) {
    if (active == null || active.equals("false")) {
      model.addAttribute("todolist", todoRepository.findAll());
    } else {
      model.addAttribute("todolist", todoRepository.findAllByDoneFalse());
    }
    return "todoslist";
  }

  @GetMapping(value = "/add")
  public String addNewTodo() {
    return "add";
  }

  @PostMapping(value = "/add")
  public String addNewTodo(Model model, @RequestParam(value = "addNewTodo", required = false) String addNewTodo) {
    model.addAttribute("addNewTodo", todoRepository.save(new Todo(addNewTodo)));
    return "redirect:";
  }

  @PostMapping(value = "/removeTodo")
  public String removeTodo(@ModelAttribute(value = "remove") long id) {
    todoRepository.deleteById(id);
    return "redirect:";
  }

  @GetMapping(value = "/{id}/edit")
  public String editTodo(Model model, @PathVariable(value = "id") long id) {
    model.addAttribute("editTodos", todoRepository.findById(id).orElse(null));
    return "edit";
  }

  @PostMapping(value = "/{id}/edit")
  public String editTodo(@ModelAttribute(value = "editTodos") Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/";
  }

  @GetMapping(value = "/search")
  public String searchByTitle() {
    return "search";
  }

  @PostMapping(value = "/search")
  public String searchByTitle(Model model, @RequestParam(value = "searchByTitle", required = false) String searchTitle) {
    model.addAttribute("todolist", todoRepository.findByTitleContaining(searchTitle));
    return "todoslist";
  }
}
