package com.lrearn.spring.service.impl;

import org.springframework.stereotype.Service;

import com.lrearn.spring.Repository.EmployeeRepository;
import com.lrearn.spring.models.Employee;
import com.lrearn.spring.service.EmployeeService;

@Service
public class EnployeeServiceImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;

	public EnployeeServiceImpl(EmployeeRepository employeerepository) {
		super();
		this.employeeRepository = employeerepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

}
