package com.tw.apistackbase.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tw.apistackbase.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeResource {
    @GetMapping()
    public ResponseEntity<List<Employee>> getAll() {
    	List<Employee> employees = new ArrayList<Employee>();
    	Employee employeeA = new Employee(0,"Xiaoming",20,"Male");
    	Employee employeeB = new Employee(1,"Xiaohong",19,"Female");
    	Employee employeeC = new Employee(2,"Xiaozhi",15,"Male");
    	Employee employeeD = new Employee(3,"Xiaogang",16,"Male");
    	Employee employeeE = new Employee(4,"Xiaoxia",15,"Female");
    	employees.add(employeeA);
    	employees.add(employeeB);
    	employees.add(employeeC);
    	employees.add(employeeD);
    	employees.add(employeeE);
        return ResponseEntity.ok(employees);
    }
    
    @GetMapping(path = "/{employeeId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int employeeId) {
    	List<Employee> employees = new ArrayList<Employee>();
    	Employee employeeA = new Employee(0,"Xiaoming",20,"Male");
    	Employee employeeB = new Employee(1,"Xiaohong",19,"Female");
    	Employee employeeC = new Employee(2,"Xiaozhi",15,"Male");
    	Employee employeeD = new Employee(3,"Xiaogang",16,"Male");
    	Employee employeeE = new Employee(4,"Xiaoxia",15,"Female");
    	employees.add(employeeA);
    	employees.add(employeeB);
    	employees.add(employeeC);
    	employees.add(employeeD);
    	employees.add(employeeE);
        return ResponseEntity.ok(employees.get(employeeId));
    }

}
