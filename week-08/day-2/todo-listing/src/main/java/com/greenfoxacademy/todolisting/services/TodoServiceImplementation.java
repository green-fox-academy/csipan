package com.greenfoxacademy.todolisting.services;

import com.greenfoxacademy.todolisting.models.Todo;
import com.greenfoxacademy.todolisting.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
@Service
public class TodoServiceImplementation implements TodoService {

  private TodoRepository todoRepository;

  @Autowired
  public TodoServiceImplementation(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public void listOfActivTodos(Model model, String active) {
    if (active == null || active.equals("false")) {
      model.addAttribute("todolist", todoRepository.findAll());
    } else {
      model.addAttribute("todolist", todoRepository.findAllByDoneFalse());
    }
  }

  public void addNewTodo(Model model, String addNewTodo) {
    model.addAttribute("addNewTodo", todoRepository.save(new Todo(addNewTodo)));
  }

  public void removeTodo(long id) {
    todoRepository.deleteById(id);
  }

  public void editTodo(Model model, long id) {
    model.addAttribute("editTodos", todoRepository.findById(id).orElse(null));
  }


  public void searchByTitle(Model model, String searchTitle) {
    model.addAttribute("todolist", todoRepository.findByTitleContaining(searchTitle));
  }

  public void save(Todo todo) {
    todoRepository.save(todo);
  }
}
