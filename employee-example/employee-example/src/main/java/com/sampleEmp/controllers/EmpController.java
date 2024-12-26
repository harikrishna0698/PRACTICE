package com.sampleEmp.controllers;

import com.sampleEmp.EmployeeExampleApplication;
import com.sampleEmp.entities.Employee;
import com.sampleEmp.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping
    public List<Employee> getAllEmployee(){
        return empService.findAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        Optional<Employee> employee = empService.findById(id);
        return employee.orElse(null);
    }
}
