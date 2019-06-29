package com.database;

import java.sql.*;

public class JavaToMySQL {
    public static void main(String[] args) {
        final String url = "jdbc:mysql://localhost:3306/mydbtest";
        final String username = "root";
        final String password = "newlife11";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM saleoeople");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
