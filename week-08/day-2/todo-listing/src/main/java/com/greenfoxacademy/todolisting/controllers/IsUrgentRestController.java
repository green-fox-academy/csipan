package com.greenfoxacademy.todolisting.controllers;

import com.greenfoxacademy.todolisting.models.IsUrgent;
import com.greenfoxacademy.todolisting.models.Todo;
import com.greenfoxacademy.todolisting.models.TodoJson;
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

  @PostMapping(value = "/todoJson/addTodo")
  public Object addTodo(@RequestBody(required = false) TodoJson todoJson) {
    Todo todo = new Todo();
    todo.setTitle(todoJson.getTitle());
    todo.setUrgent(todoJson.getUrgent());
    todo.setDone(todoJson.getDone());
    todoService.save(todo);
    return todo;
  }
}
