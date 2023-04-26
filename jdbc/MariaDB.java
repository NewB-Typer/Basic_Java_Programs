package com.jdbc;
import java.sql.*;

public class MariaDB {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/mydb", "milan", "real");
            System.out.println("Connection established!");
        } catch (Exception e) {
            System.err.println("Cannot connect to database server: " + e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Connection closed.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }}}}}