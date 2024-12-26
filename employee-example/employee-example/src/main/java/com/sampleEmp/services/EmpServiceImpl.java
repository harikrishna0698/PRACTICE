package com.sampleEmp.services;

import com.sampleEmp.entities.Employee;
import com.sampleEmp.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    private EmpRepository empRepository;

    @Override
    public Optional<Employee> findById(int id) {
        return empRepository.findById(id);
    }

    @Override
    public List<Employee> findAll() {
        return empRepository.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        return empRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        if(empRepository.existsById(employee.getId())){
            return empRepository.save(employee);
        }
        return null;
    }

    @Override
    public void delete(int id) {
        empRepository.deleteById(id);
    }
}
