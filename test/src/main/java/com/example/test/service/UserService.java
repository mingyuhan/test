package com.example.test.service;

import com.example.test.entity.User;
import com.example.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired(required=false)
    public UserMapper userMapper;

    public List<User> findAllUser(){
        return userMapper.findAllUser();
    }

    public List<User> findUserByUserId(int userid){
        return userMapper.findUserByUserId(userid);
    }

    }


