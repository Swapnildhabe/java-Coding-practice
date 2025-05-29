package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCMysql {
    public static void main(String[] args) {
//        Load the driver
//        Register the dirver with DiverManger
//        Establish the connection
//        Create a statement to write query
//        Execute the query
//        Process the results
//        close the connection/statement/resultset
        try{
            final String URL = "jdbc:mysql://localhost:3306/devgen";
            final String USER = "root";
            final String PASS = "1234567890";
            final String query = "Select * from student";
            Connection connection = DriverManager.getConnection(URL, USER,PASS);
            Statement statement = connection.createStatement();
            final ResultSet rs = statement.executeQuery(query);

            while (rs.next()){
                final int id = rs.getInt("id");
                final String name = rs.getString("name");
                final int age = rs.getInt("age");

                System.out.println("Id: "+ id +" Name: "+ name+ " Age "+ age);
            }
            rs.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

