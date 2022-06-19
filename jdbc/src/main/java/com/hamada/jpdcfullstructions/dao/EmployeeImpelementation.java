package com.hamada.jpdcfullstructions.dao;

import com.hamada.jpdcfullstructions.employeemodel.Employee;
import com.hamada.jpdcfullstructions.utils.Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class EmployeeImpelementation implements EmployeeDao {
    static List<Employee> employeesList = new LinkedList<>();

    @Override
    public List<Employee> findAll() {
        Connection con = DBase.getConnection();
        if (con == null) {
            return null;
        }


        String query = "SELECT * FROM employee;";
        try (PreparedStatement preparedStatement = con.prepareStatement(query)) {

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Employee employee = Employee.builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString("name"))
                        .gender(resultSet.getBoolean("gender"))
                        .birthDate(resultSet.getDate("birth_date"))
                        .salary(resultSet.getDouble("salary"))
                        .build();

                employeesList.add(employee);
            }

        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

        return employeesList;
    }

    @Override
    public void deleteAll() {
        Connection con = DBase.getConnection();
        if (con == null) {
            System.out.println("when update there is null connection");

            return;
        }

        String query = "DELETE FROM employee ;";
        try (PreparedStatement preparedStatement = con.prepareStatement(query)) {

            System.out.println("deleted");

            preparedStatement.executeUpdate();

        } catch (SQLException se) {
            System.out.println("when delete there is error");

            se.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }


    @Override
    public Employee findById(int id) {
        Connection con = DBase.getConnection();
        if (con == null) {
            return null;
        }

        String query = "SELECT * FROM employee WHERE id=?;";
        try (PreparedStatement preparedStatement = con.prepareStatement(query)) {

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {

                return Employee.builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString("name"))
                        .gender(resultSet.getBoolean("gender"))
                        .birthDate(resultSet.getDate("birth_date"))
                        .salary(resultSet.getDouble("salary"))
                        .build();
            }

        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

        return null;
    }

    @Override
    public void save(Employee employee) {
        Connection con = DBase.getConnection();
        if (con == null) {
            System.out.println("connection = null");
            return;
        }

        if (employee.getId() == 0) { // Create
            System.out.println("into create ");

            String query = "INSERT INTO employee (name, gender, birth_date, salary) VALUES (?, ?, ?, ?);";
            try (PreparedStatement preparedStatement = con.prepareStatement(query)) {

                preparedStatement.setString(1, employee.getName());
                preparedStatement.setBoolean(2, employee.isGender());
                preparedStatement.setDate(3, Utils.getSqlDate(employee.getBirthDate()));
                preparedStatement.setDouble(4, employee.getSalary());
                System.out.println("inserted into create ");
                preparedStatement.executeUpdate();
            } catch (SQLException se) {
                se.printStackTrace();
                System.out.println("there is an error when insert into create ");

            } finally {
                try {
                    con.close();
                    System.out.println("closing the insert into create ");

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                    System.out.println("there is an error when closing the insert into create ");
                }
            }
        }
    }

    @Override
    public void update(Employee employee) {
        Connection con = DBase.getConnection();


        if (employee.getId() > 0) { // Update
            System.out.println("into update ");
            String query = "UPDATE employee SET name=?, gender=?, birth_date=?, salary=? WHERE id=?;";
            try (PreparedStatement preparedStatement = con.prepareStatement(query)) {

                preparedStatement.setString(1, employee.getName());
                preparedStatement.setBoolean(2, employee.isGender());
                preparedStatement.setDate(3, Utils.getSqlDate(employee.getBirthDate()));
                preparedStatement.setDouble(4, employee.getSalary());
                preparedStatement.setInt(5, employee.getId());
                System.out.println("updated ");
                preparedStatement.executeUpdate();
            } catch (SQLException se) {
                System.out.println("update error into create ");

                se.printStackTrace();
            } finally {
                try {
                    con.close();
                    System.out.println("closing update into create ");

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    @Override
    public void deleteById(int id) {
        Connection con = DBase.getConnection();
        if (con == null) {
            System.out.println("when update there is null connection");

            return;
        }

        String query = "DELETE FROM employee WHERE id=?;";
        try (PreparedStatement preparedStatement = con.prepareStatement(query)) {

            preparedStatement.setInt(1, id);
            System.out.println("deleted");

            preparedStatement.executeUpdate();
        } catch (SQLException se) {
            System.out.println("when delete there is error");

            se.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}

