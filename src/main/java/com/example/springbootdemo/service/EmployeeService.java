package com.example.springbootdemo.service;

import com.example.springbootdemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    public List<Employee> getEmployees() {

        return List.of(Employee.builder().name("Rehman").surname("Sultanlii").build());
    }
}
