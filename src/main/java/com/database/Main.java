package com.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        DBWorker worker = new DBWorker();

        String query = "select * from users1";

        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                User user = new User("sad","sds");
                user.setId(resultSet.getInt(1));
              //  user.getUsername(resultSet.getString("dsad"));
               // user.getPassword(resultSet.getString(3,'f'));
                int id = resultSet.getInt(1);
                System.out.println(id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
