package com.example.dockerspringboot.services;

import com.example.dockerspringboot.models.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private User user;

    public List<User> getUserS(){
        return Arrays.asList(
                new User(1,"bill","bill@gmail.com"),
                new User(2,"missy","missy@gmail.com"),
                new User(3,"george","george@gmail.com"));
    }
}
