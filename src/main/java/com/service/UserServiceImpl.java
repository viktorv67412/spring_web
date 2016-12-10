package com.service;

import com.dao.UserDao;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    public List<User> checkCredentials(User userToCheck) throws IOException {

        List<User> allUsers = userDao.getAllUsers();

        if (allUsers.get(0).equals(userToCheck)) {
            return getAllUsers();
        } else {
            System.err.println("User doesn't exist :(");
            return null;
        }
    }


    public List<User> getAllUsers() throws IOException {
        return userDao.getAllUsers();
    }

    public List<User> addUser(User user) throws IOException {
        return userDao.addUser(user);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
