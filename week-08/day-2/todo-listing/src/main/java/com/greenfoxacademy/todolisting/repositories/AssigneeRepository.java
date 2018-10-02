package com.greenfoxacademy.todolisting.repositories;

import com.greenfoxacademy.todolisting.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
  List<Assignee> findAll();
  List<Assignee> findByNameContaining(String string);
}
