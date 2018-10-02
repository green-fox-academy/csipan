package com.greenfoxacademy.groot.service;

import com.greenfoxacademy.groot.model.ErrorMessage;
import com.greenfoxacademy.groot.model.Message;
import org.springframework.stereotype.Service;

@Service
public interface GuardianService {

  Message getMessage(String message);

  ErrorMessage getErrorMessage();
}
