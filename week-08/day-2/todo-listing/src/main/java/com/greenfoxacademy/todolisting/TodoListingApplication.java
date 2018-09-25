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
    todoRepository.save(new Todo("Daily task", false, false));
    todoRepository.save(new Todo("Make the beds", true, true));
    todoRepository.save(new Todo("Do the whasing up", true, false));
    todoRepository.save(new Todo("Clean the bathroom and the kitchen", true, true));
  }
}
