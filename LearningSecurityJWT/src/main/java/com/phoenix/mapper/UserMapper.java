package com.phoenix.mapper;

import com.phoenix.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public User findByUsername(String username);
}
