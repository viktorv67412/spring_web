package com.service;

import com.model.User;

import java.io.IOException;
import java.util.List;

public interface UserService {

    List<User> getAllUsers() throws IOException;

    List<User> addUser(User newUser) throws IOException;

    List<User> checkCredentials(User userToCheck) throws IOException;
}
