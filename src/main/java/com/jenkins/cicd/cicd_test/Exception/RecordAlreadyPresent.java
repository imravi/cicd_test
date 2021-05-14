package com.jenkins.cicd.cicd_test.Exception;

public class RecordAlreadyPresent extends RuntimeException {

  public RecordAlreadyPresent(String message) {

    super(message);
  }

  public RecordAlreadyPresent(String message, Throwable ex) {

    super(message, ex);
  }

}
