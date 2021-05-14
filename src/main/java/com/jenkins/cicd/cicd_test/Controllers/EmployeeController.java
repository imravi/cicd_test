package com.jenkins.cicd.cicd_test.Controllers;

import java.util.List;

import com.jenkins.cicd.cicd_test.Exception.RecordAlreadyPresent;
import com.jenkins.cicd.cicd_test.POJO.Employee;
import com.jenkins.cicd.cicd_test.Service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @PostMapping("/add")
  public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) throws RecordAlreadyPresent {

    return new ResponseEntity<Employee>(employeeService.addEmployee(emp), HttpStatus.OK);
  }

  @GetMapping("/all")
  public ResponseEntity<List<Employee>> retrieveAallEmployee() {
    return new ResponseEntity<List<Employee>>(employeeService.getAllEmployees(), HttpStatus.OK);
  }
}
