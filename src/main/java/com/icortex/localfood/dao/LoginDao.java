package com.icortex.localfood.dao;

import com.icortex.localfood.model.User;
import com.icortex.localfood.util.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDao {
    public String authenticateUser(User user){
        String username = user.getUsername();
        String password = user.getPassword();
        Connection connection = null;

        try {
            connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery("select name,password from users");

            while (result.next()){
                String name = result.getString("name");
                String pass = result.getString("password");

                if(username.equals(name) && password.equals(pass)){
                    return "Success";
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "Invalid credential";
    }
}
