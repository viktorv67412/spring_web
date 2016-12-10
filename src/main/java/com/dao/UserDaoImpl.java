package com.dao;

import com.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    private List<User> users = new ArrayList<User>(Arrays.asList(new User("name1", "name1"),
            new User("name2", "name2"),
            new User("name3", "name3"),
            new User("name4", "name4")));

    public List<User> getAllUsers() {
        return users;
    }

    public List<User> addUser(User user) {
        users.add(user);
        return users;
    }
}
