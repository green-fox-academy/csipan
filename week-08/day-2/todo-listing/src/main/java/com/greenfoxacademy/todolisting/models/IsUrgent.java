package com.greenfoxacademy.todolisting.models;

import java.util.ArrayList;
import java.util.List;

public class IsUrgent {

  List<Todo> urgentTodos;

  public IsUrgent() {
  }

  public IsUrgent(List<Todo> urgentTodos) {
    this.urgentTodos = urgentTodos;
  }

  public List<Todo> getUrgentTodos() {
    return urgentTodos;
  }

  public void setUrgentTodos(List<Todo> urgentTodos) {
    this.urgentTodos = urgentTodos;
  }
}
