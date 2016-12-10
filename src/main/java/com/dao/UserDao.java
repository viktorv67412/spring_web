package com.dao;

import com.model.User;

import java.io.IOException;
import java.util.List;

public interface UserDao {

    List<User> getAllUsers() throws IOException;

    List<User> addUser(User newUser) throws IOException;
}
