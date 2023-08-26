package com.lrearn.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lrearn.spring.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
