package com.program.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.program.entity.Employee;
import com.program.repository.EmpRepository;

import jakarta.servlet.http.HttpSession;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpRepository empRepo;

    @Override
    public Employee saveEmp(Employee emp) {
        // Save employee to the database and return the saved employee
    	
    	Employee newEmp = empRepo.save(emp);
        return newEmp;
    }

    @Override
    public List<Employee> getAllEmp() {
        // Retrieve all employees from the database
        return empRepo.findAll();
    }

    @Override
    public Employee getEmpById(int id) {
        // Find employee by ID
        Optional<Employee> employee = empRepo.findById(id);
        return employee.orElse(null); // Return the employee or null if not found
    }

    @Override
    public boolean deleteEmp(int id) {
        // Check if the employee exists before deleting
        if (empRepo.existsById(id)) {
            empRepo.deleteById(id); // Delete employee by ID
            return true; // Deletion was successful
        }
        return false; // Employee not found, deletion not performed
    }
    
    public void removeSessionMessage() {
		HttpSession session = ((ServletRequestAttributes) (RequestContextHolder.getRequestAttributes())).getRequest()
				.getSession();

		session.removeAttribute("msg");

	}
}
