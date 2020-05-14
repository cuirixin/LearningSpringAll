package com.phoenix.service;

import com.phoenix.mapper.UserMapper;
import com.phoenix.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> getList() {
        return userMapper.findAll();
    }
}
