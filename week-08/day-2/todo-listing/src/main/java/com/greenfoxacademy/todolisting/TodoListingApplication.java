package com.greenfoxacademy.todolisting;

import com.greenfoxacademy.todolisting.models.Todo;
import com.greenfoxacademy.todolisting.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoListingApplication implements CommandLineRunner {
  public static void main(String[] args) {
    SpringApplication.run(TodoListingApplication.class, args);
  }

  private TodoRepository todoRepository;

  @Autowired
  public TodoListingApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Start the day"));
    todoRepository.save(new Todo("Finish H2 workshop1"));
    todoRepository.save(new Todo("Finish JPA workshop2"));
    todoRepository.save(new Todo("Create a CRUD project"));
  }
}
