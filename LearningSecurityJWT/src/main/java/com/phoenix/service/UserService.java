package com.phoenix.service;

import com.phoenix.mapper.UserMapper;
import com.phoenix.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    @Resource
    private UserMapper userMapper;

    public User getByName(String username) {
        return userMapper.findByUsername(username);
    }

}
