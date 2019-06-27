package com.database;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Example {

    private final static String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "newlife11";

    public static void main(String[] args) {
        Connection connection;

        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

            if (!connection.isClosed()){
                System.out.println("Connection with database - established! ");
            }
            connection.close();

            if (connection.isClosed()){
                System.out.println("Connection with database - close! ");
            }
        } catch (SQLException e) {
            System.out.println("Не удалось загрузить класс драйвера!");
        }
    }
}
