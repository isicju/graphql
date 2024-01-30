package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    public List<Employee> getAllEmployees() {
        Location dubai = new Location(3, "Dubai", "Middle East", "Sand area");
        Location london = new Location(3, "London", "Europe", "Rain area");

        List<Employee> salesCeos = Arrays.asList(new Employee(999, "Bossy", null));
        List<Employee> hrCeos = Arrays.asList(new Employee(111, "Also Bossy", null));

        Department sales = new Department(33, 3121, "Sales", dubai, salesCeos);
        Department hr = new Department(22, 999, "HR", london, hrCeos);
        Employee james = new Employee(12, "James", sales);
        Employee peter = new Employee(12, "James", hr);
        return List.of(james, peter);
    }
}
