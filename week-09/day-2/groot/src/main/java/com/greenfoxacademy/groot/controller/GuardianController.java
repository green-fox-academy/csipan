package com.greenfoxacademy.groot.controller;

import com.greenfoxacademy.groot.model.ErrorMessage;
import com.greenfoxacademy.groot.service.GuardianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  private GuardianService guardianService;

  @Autowired
  public GuardianController(GuardianService guardianService) {
    this.guardianService = guardianService;
  }

  @GetMapping(value = "/groot")
  public ResponseEntity<?> grooting(@RequestParam(value = "message", required = false) String message) {
    if (message == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(guardianService.getErrorMessage());
    } else {
      return ResponseEntity.ok(guardianService.getMessage(message));
    }
  }
}
