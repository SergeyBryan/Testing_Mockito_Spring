package com.example.testing_mockito.service;

import com.example.testing_mockito.dao.UserDao;
import com.example.testing_mockito.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping
    public boolean checkUserExist(User user) {
        User newUser = userDao.getUserByName(user.getName());
        if (newUser == null) {
            return false;
        }
        return newUser.equals(user);
    }


}
