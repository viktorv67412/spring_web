package com.dao;

import com.model.User;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    private List<User> users;

    private void usersFromProperties() {

        Properties properties = new Properties();
        InputStream resourceAsStream = UserDaoImpl.class.getClassLoader().getResourceAsStream("credentials.properties");
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<User> users = new ArrayList<User>();
        users.add(new User(properties.getProperty("name"), properties.getProperty("password")));
        this.users = users;
        try {
            resourceAsStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<User> getAllUsers() throws IOException {
        usersFromProperties();
        return users;
    }

    public List<User> addUser(User user) throws IOException {
        users.add(user);
        return users;
    }
}
