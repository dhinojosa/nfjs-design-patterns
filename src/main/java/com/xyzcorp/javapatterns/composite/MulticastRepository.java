package com.xyzcorp.javapatterns.composite;

import com.xyzcorp.javapatterns.composite.domain.Employee;
import com.xyzcorp.javapatterns.composite.domain.EmployeeRepository;

import java.util.List;

public class MulticastRepository implements EmployeeRepository {

    private final List<EmployeeRepository> list;

    public MulticastRepository(List<EmployeeRepository> list) {
        this.list = list;
    }

    @Override
    public void addEmployee(Employee employee) {
        for (EmployeeRepository repository: list) {
            repository.addEmployee(employee);
        }
    }
}
