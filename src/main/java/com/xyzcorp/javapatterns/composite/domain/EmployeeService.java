package com.xyzcorp.javapatterns.composite.domain;

public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void hireNewEmployee(Employee employee) {
        this.employeeRepository.addEmployee(employee);
    }
}
