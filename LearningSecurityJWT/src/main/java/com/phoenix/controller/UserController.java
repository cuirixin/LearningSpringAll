package com.phoenix.controller;

import com.phoenix.service.UserService;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public DomainResult hello() {
        return success(null);
    }

}
