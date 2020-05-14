package com.phoenix.controller;

import com.phoenix.model.User;
import com.phoenix.service.UserService;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/getUsers")
    public List<User> getUsers() {
        return this.userService.getList();
    }

    @RequestMapping("/saveUser")
    public void saveUser(@Valid User user, BindingResult result) {
        System.out.println("user: "+user);
        if(result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                System.out.println(error.getCode()+ "-" + error.getDefaultMessage());
            }
        }
    }
}
