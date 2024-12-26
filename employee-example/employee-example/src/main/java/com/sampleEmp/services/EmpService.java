package com.sampleEmp.services;


import com.sampleEmp.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmpService{
    Optional<Employee> findById(int id);
    List<Employee> findAll();
    Employee save(Employee employee);
    Employee update(Employee employee);
    void delete(int id);
}
