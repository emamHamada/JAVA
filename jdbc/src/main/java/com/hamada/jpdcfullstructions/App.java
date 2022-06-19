package com.hamada.jpdcfullstructions;


import com.hamada.jpdcfullstructions.dao.EmployeeDao;
import com.hamada.jpdcfullstructions.dao.EmployeeImpelementation;
import com.hamada.jpdcfullstructions.employeemodel.Employee;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeImpelementation();

        Employee employee = Employee.builder()
                .name("Mohamed")
                .gender(true)
                .birthDate(new Date())
                .salary(2356d)
                .build();


        employeeDao.save(employee);
        employeeDao.findAll().forEach(System.out::println);
        Employee emp = employeeDao.findById(25);
        System.out.println(emp);

        employeeDao.deleteById(24);
    }
}

