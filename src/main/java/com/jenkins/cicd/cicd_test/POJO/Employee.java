package com.jenkins.cicd.cicd_test.POJO;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "employee")
@Table
public class Employee {

  @Column
  @Id
  private int id;
  @Column
  private String name;
  @Column
  private String city;
  @Column
  private double salary;
}
