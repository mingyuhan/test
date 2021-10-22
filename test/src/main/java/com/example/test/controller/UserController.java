package com.example.test.controller;

import com.example.test.entity.User;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService UserService;

    @RequestMapping("/getAllUser")
    public List<User> findAll(){
        return UserService.findAllUser();
    }

    @RequestMapping("/getUserByUserID/{userid}")
    public List<User> findUserByUserId(@PathVariable int userid){
        return UserService.findUserByUserId(userid);
    }


}

