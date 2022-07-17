package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.Employee;
import com.example.springbootdemo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor // final fieldlerin constructorunu yaradir
public class EmployeeController {


    private final EmployeeService employeeService;

    @GetMapping("/emp")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }


}
