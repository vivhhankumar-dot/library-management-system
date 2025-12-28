/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Sudhir Kushwaha
 */
public class Connect {


    public static Connection ConnectToDB() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/library_management?useSSL=false&serverTimezone=UTC",
                "root",
                "root"
            );

            System.out.println("Database Connected");
            return con;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Failed");
            return null;
        }
    }
}