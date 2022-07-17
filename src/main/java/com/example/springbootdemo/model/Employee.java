package com.example.springbootdemo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder // builder patterni desteklemek ucun
public class Employee {
    private String name;
    private String surname;
}
