package com.norwood.service;

import com.norwood.domain.Company;
import com.norwood.domain.Employee;

import java.util.Random;
import java.util.Set;

public class EmployeeService {
    static{
        Employee emp1 = new Employee();
        Random random = new Random(10);
        emp1.setId(random.nextLong());
        emp1.setFName("Jack");
        emp1.setLName("Carlos");

        Employee emp2= new Employee();

        emp2.setId(random.nextLong());
        emp2.setFName("Missi");
        emp2.setLName("Jackson");

        Employee emp3= new Employee();

        emp2.setId(random.nextLong());
        emp2.setFName("Shane");
        emp2.setLName("Mat");

        Company company = new Company();
        company.getEmplyees().add(emp1);
        company.getEmplyees().add(emp2);
        company.getEmplyees().add(emp3);
    }


    public Set<Employee> getEmployees() {

    }
}
