package com.icortex.localfood.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws Exception{
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/users";
        String username = "root";
        String password = "Mcse97@mahin";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }
}
