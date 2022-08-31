package com.anferdev.ejemplo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Ejemplo3Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Ejemplo3Application.class, args);
        EmployeeRepository repository = (EmployeeRepository) context.getBean("employeeRepository");

        Employee employee1 = new Employee(null, "Andrea Morales Sanchez", "ha@gmail.com", 5);
        Employee employee2 = new Employee(null, "Fernanda Morales Sanchez", "ca@gmail.com", 3);

        repository.save(employee1);
        repository.save(employee2);

        System.out.println("******************************");
        System.out.println("Usando EmployeeRepository");
        System.out.println("******************************");

        List<Employee> employees = repository.findAll();

        //employees.forEach(e -> System.out.println(e.getNames()));
        employees.forEach(System.out::println);

    }

}
