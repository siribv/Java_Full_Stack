package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteExample {

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

            String sql = "DELETE FROM students WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 5);

            int rows = ps.executeUpdate();

            System.out.println(rows + " student deleted successfully!");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}