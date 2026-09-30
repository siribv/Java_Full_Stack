package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionExample {

    static String url = "jdbc:mysql://localhost:3306/studentdb";
    static String username = "root";
    static String password = "Siri@2007";

    public static void main(String[] args) {

        try {
            // 1. Connect to MySQL
            Connection con = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

            System.out.println("Database connected successfully!");

            // 2. Create Statement
            Statement stmt = con.createStatement();

            // 3. Execute SELECT query
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // 4. Read data row by row
            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getInt("age") + " " +
                                rs.getString("course")
                );
            }

            // 5. Close connection
            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}