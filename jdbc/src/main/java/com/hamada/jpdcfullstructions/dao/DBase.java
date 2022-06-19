package com.hamada.jpdcfullstructions.dao;
// start connection with end point
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBase {
    private static final String HOSTING = "127.0.0.1";// that equal to localhost
    private static final int PORT = 3306;// that is the number of the access port to the mysql database
    private static final String DB_NAME = "jdbc_full_instructions";
    private static final String USERNAME = "hamada";
    private static final String PASSWORD =  "hamada012";
    private static Connection connection;

    public static Connection getConnection() {

        try {
            connection = DriverManager.getConnection(String.format("jdbc:mysql://%s:%d/%s", HOSTING, PORT, DB_NAME), USERNAME, PASSWORD);
        } catch (SQLException se) {
            se.printStackTrace();
            System.out.println("error connection" + se);
        }
        return connection;


    }
}
