package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "Siri@2007";

        try {
            Connection con = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

            String sql = "INSERT INTO students (name, age, course) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, "Kiran");
            ps.setInt(2, 20);
            ps.setString(3, "Java");

            int rows = ps.executeUpdate();

            System.out.println(rows + " student inserted successfully!");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}