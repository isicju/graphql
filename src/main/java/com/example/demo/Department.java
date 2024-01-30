package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Department {
    private int departmentId;
    private int employeeNumber;
    private String departmentName;
    private Location location;
    private List<Employee> ceos;
}
