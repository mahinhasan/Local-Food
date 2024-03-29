package com.icortex.localfood.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/myDB";
        String username = "root";
        String password = "Mcse97@mahin";
        try {
            con = DriverManager.getConnection(url,username,password);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }
}
