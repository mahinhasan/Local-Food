package com.icortex.localfood.dao;

import com.icortex.localfood.model.User;

public interface UserDao {
    public boolean userRegister(User user) throws Exception;
}
