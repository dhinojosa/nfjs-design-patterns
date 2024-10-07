package com.xyzcorp.javapatterns.composite.rabbitmq;

import com.xyzcorp.javapatterns.composite.domain.Employee;
import com.xyzcorp.javapatterns.composite.domain.EmployeeRepository;

public class RabbitMQEmployeeRepository implements EmployeeRepository {
    @Override
    public void addEmployee(Employee employee) {
        System.out.println("Added employee to an MQ");
    }
}
