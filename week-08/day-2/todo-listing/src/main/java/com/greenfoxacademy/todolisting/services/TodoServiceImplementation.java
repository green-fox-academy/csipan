package com.greenfoxacademy.todolisting.services;

import com.greenfoxacademy.todolisting.models.Assignee;
import com.greenfoxacademy.todolisting.models.Todo;
import com.greenfoxacademy.todolisting.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class TodoServiceImplementation implements TodoService {

  private TodoRepository todoRepository;

  @Autowired
  public TodoServiceImplementation(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public void listOfActivTodos(Model model, String active) {
    if (active == null || active.equals("false")) {
      Iterable<Todo> todos = todoRepository.findAll();
      model.addAttribute("todolist", todos);
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

  public List<Todo> searchByTitle(String searchTitle) {
    return todoRepository.findByTitleContaining(searchTitle);
  }

  public Todo addAssigneeToTodo(Assignee assignee, long id) {
   Todo newTodo = todoRepository.findById(id).get();
   newTodo.setAssignee(assignee);
   return newTodo;
  }


  public void save(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public List<Todo> getAllUrgent() {
    List<Todo> todo = todoRepository.findAllByUrgentTrue();
    return todo;
  }

  @Override
  public void addTodo(String todoTitle) {
    todoRepository.save(new Todo(todoTitle));
  }

  @Override
  public List<Todo> findAll() {
    return todoRepository.findAll();
  }


}
