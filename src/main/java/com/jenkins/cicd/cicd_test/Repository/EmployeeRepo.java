package com.jenkins.cicd.cicd_test.Repository;

import com.jenkins.cicd.cicd_test.POJO.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
