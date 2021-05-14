package com.jenkins.cicd.cicd_test.Exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonExceptionSetter {

  private String message;
  private LocalDateTime time;
}
