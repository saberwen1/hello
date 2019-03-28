package com.fate.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fate
 * @Date: 2019/3/28 16:27
 * @Version 1.0
 */
@RestController
public class HelloController {

    @RequestMapping
    public String hello() {
        return "hello world";
    }
}
