package com.greenfoxacademy.todolisting.services;

import com.greenfoxacademy.todolisting.models.Assignee;
import org.springframework.ui.Model;

import java.util.List;

public interface AssigneeService {

  List<Assignee> findAll();

  void addNewAssignee(Model model, String name, String email);

  void removeAssignee(long id);

  void editAssignee(Model model, long id);

  void saveAssignee(Assignee assignee);

  void searchByAssignee(Model model, String searchByAssignee);
}
