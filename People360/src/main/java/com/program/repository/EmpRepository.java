package com.program.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.program.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee,Integer> {

}
