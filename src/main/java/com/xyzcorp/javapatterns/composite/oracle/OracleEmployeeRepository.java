package com.xyzcorp.javapatterns.composite.oracle;

import com.xyzcorp.javapatterns.composite.domain.EmployeeRepository;
import com.xyzcorp.javapatterns.composite.domain.Employee;

public class OracleEmployeeRepository implements EmployeeRepository {
    @Override
    public void addEmployee(Employee employee) {
        System.out.println("Added employee to an Oracle DB");
    }
}
