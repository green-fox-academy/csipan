package com.greenfoxacademy.todolisting.services;

import com.greenfoxacademy.todolisting.models.Assignee;
import com.greenfoxacademy.todolisting.models.Todo;
import org.springframework.ui.Model;

public interface TodoService {

  void listOfActivTodos(Model model, String active);

  void addNewTodo(Model model, String addNewTodo);

  void removeTodo(long id);

  void editTodo(Model model, long id);

  void save(Todo todo);

  void searchByTitle(Model model, String searchByTitle);

  Todo addAssigneeToTodo(Assignee assignee, long id);
}
