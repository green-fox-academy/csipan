package com.greenfoxacademy.todolisting.controllers;

import com.greenfoxacademy.todolisting.models.IsUrgent;
import com.greenfoxacademy.todolisting.models.Todo;
import com.greenfoxacademy.todolisting.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IsUrgentRestController {

  private TodoService todoService;

  @Autowired
  public IsUrgentRestController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping(value = "/todo/isUrgent")
  public IsUrgent urgentTodos() {
    IsUrgent todoList = new IsUrgent();
    List<Todo> urgentTodo = todoService.getAllUrgent();
    todoList.setUrgentTodos(urgentTodo);
    return todoList;
  }

  @PostMapping(value = "/todo/addTodo")
  public Object addTodo(@RequestBody(required = false) String todoTitle, @PathVariable(value = "title", required = false) String title) {
    Todo newTodo = new Todo(todoTitle);
    todoService.save(newTodo);
    return newTodo;
  }
}
