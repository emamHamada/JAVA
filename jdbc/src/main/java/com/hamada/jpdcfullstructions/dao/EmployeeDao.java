package com.hamada.jpdcfullstructions.dao;

import com.hamada.jpdcfullstructions.employeemodel.Employee;

import java.util.LinkedList;
import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();

    void deleteAll();

    Employee findById(int id);

    void save(Employee employee);

    void update(Employee employee);

    void deleteById(int id);

}
