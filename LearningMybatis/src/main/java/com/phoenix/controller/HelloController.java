package com.phoenix.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/name")
    public String name(String n) {
        return "hello world" + n;
    }

    @RequestMapping(value = "/name2/{n}", method = RequestMethod.GET)
    public String name2(@PathVariable String n) {
        return "name" + n;
    }
}
