package com.greenfoxacademy.todolisting.repositories;

import com.greenfoxacademy.todolisting.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
