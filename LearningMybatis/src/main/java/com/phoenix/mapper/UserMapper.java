package com.phoenix.mapper;

import com.phoenix.model.User;
import com.phoenix.model.UserQueryVO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface UserMapper {

    public User findUserById(int id) throws Exception;

    public List<User> findUsersByName(String name) throws Exception;

    public User findUserByHashmap(HashMap hashMap);

    public List<User> findAll();

    public Integer insertUser(User user) throws Exception;

    public void deleteUserById(int id);

    public void updateUser(User user);

    public List<User> findUserList(UserQueryVO userQueryVO);

    public Integer findUserCount(UserQueryVO userQueryVO);

}
