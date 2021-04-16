package com.icf.assignment.springboot.service;

import java.util.List;

import com.icf.assignment.springboot.model.Employee;

public interface EmployeeService {
List<Employee> getAllEmployees();
void saveEmployee(Employee employee);
Employee getEmployeeById(long id);
void deleteEmployeebyId(long id);
}
