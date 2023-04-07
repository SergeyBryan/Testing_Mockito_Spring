package com.example.testing_mockito.dao;

import com.example.testing_mockito.model.User;

import java.util.Set;

public interface UserDao {


    User getUserByName(String name);

    Set<User> findAllUsers();
}
