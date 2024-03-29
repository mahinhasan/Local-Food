package com.icortex.localfood.dao;

import com.icortex.localfood.model.User;
import com.icortex.localfood.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class RegisterDao implements UserDao{

    Connection con = null;
    @Override
    public boolean userRegister(User user) throws Exception {
        String query = "insert into users (name,email,password,gender,city) values(?,?,?,?,?)";
        con = DBConnection.getConnection();
        PreparedStatement statement = con.prepareStatement(query);
        statement.setString(1,user.getUsername());
        statement.setString(2,user.getEmail());
        statement.setString(3,user.getPassword());
        statement.setString(4,user.getGender());
        statement.setString(5,user.getCity());
        int n =  statement.executeUpdate();

        if(n == 1){
            return true;
        }
        return false;
    }
}
