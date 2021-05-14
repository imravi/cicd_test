package com.jenkins.cicd.cicd_test.Service;

import java.util.List;

import com.jenkins.cicd.cicd_test.Exception.RecordAlreadyPresent;
import com.jenkins.cicd.cicd_test.POJO.Employee;
import com.jenkins.cicd.cicd_test.Repository.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

  @Autowired
  private EmployeeRepo emprepo;

  public Employee addEmployee(Employee e) throws RecordAlreadyPresent {
    Employee emp = null;
    if (emprepo.findById(e.getId()).isEmpty()) {
      emp = emprepo.save(e);
    } else {
      throw new RecordAlreadyPresent("Record Already Present");
    }
    return emp;
  }

  public List<Employee> getAllEmployees() {
    return emprepo.findAll();
  }
}
