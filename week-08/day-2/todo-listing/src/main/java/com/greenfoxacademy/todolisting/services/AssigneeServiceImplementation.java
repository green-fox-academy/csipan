package com.greenfoxacademy.todolisting.services;

import com.greenfoxacademy.todolisting.models.Assignee;
import com.greenfoxacademy.todolisting.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class AssigneeServiceImplementation implements AssigneeService {


  private AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeServiceImplementation(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @Override
  public List<Assignee> findAll() {
    return assigneeRepository.findAll();
  }

  @Override
  public void addNewAssignee(Model model, String name, String email) {
    model.addAttribute("addNewAssignee", assigneeRepository.save(new Assignee(name,email)));
  }

  @Override
  public void removeAssignee(long id) {

  }

  @Override
  public void editAssignee(Model model, long id) {

  }

  @Override
  public void saveAssigne(Assignee assignee) {

  }
}
