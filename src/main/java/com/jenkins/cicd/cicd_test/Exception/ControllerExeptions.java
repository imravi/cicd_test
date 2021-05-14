package com.jenkins.cicd.cicd_test.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExeptions {

  @ExceptionHandler(value = RecordAlreadyPresent.class)
  public ResponseEntity<?> recordPresent(RecordAlreadyPresent ex) {
    CommonExceptionSetter setter = new CommonExceptionSetter();
    setter.setMessage(ex.getMessage());
    setter.setTime(LocalDateTime.now());
    return new ResponseEntity<CommonExceptionSetter>(setter, HttpStatus.BAD_REQUEST);
  }
}
