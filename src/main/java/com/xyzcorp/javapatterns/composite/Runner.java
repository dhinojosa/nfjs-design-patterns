package com.xyzcorp.javapatterns.composite;

import com.xyzcorp.javapatterns.composite.domain.Employee;
import com.xyzcorp.javapatterns.composite.oracle.OracleEmployeeRepository;
import com.xyzcorp.javapatterns.composite.rabbitmq.RabbitMQEmployeeRepository;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        MulticastRepository multicastRepository =
            new MulticastRepository(List.of(
                new OracleEmployeeRepository(),
                new RabbitMQEmployeeRepository()));
        multicastRepository.
            addEmployee(new Employee("30", "Stan", "Williamson"));
    }
}
