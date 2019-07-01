package com.database;

import java.sql.*;

public class JavaToMySQL {
    public static void main(String[] args) throws ClassNotFoundException {
        final String url = "jdbc:mysql://localhost:3306/mydbtest";
        final String username = "root";
        final String password = "newlife11";
        Class.forName("com.mysql.jdbc.Driver");

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT Sname,COMM,Snum from saleoeople");
            while (resultSet.next()) {
                System.out.print(resultSet);

                System.out.print(resultSet.getString(2)+" ");

            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
