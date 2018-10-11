package com.greenfoxacademy.todolisting.services;

import com.greenfoxacademy.todolisting.models.Assignee;
import com.greenfoxacademy.todolisting.models.Todo;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public interface TodoService {

  void listOfActivTodos(Model model, String active);

  void addNewTodo(Model model, String addNewTodo);

  void removeTodo(long id);

  void editTodo(Model model, long id);

  void save(Todo todo);

  List<Todo> searchByTitle(String searchByTitle);

  Todo addAssigneeToTodo(Assignee assignee, long id);

  List<Todo> getAllUrgent();

  void addTodo(String todoTitle);

  List<Todo> findAll();
}
