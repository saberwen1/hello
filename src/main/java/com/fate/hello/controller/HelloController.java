package com.fate.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: fate
 * @Date: 2019/3/28 16:27
 * @Version 1.0
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/rest")
    public List rest() {
        String[] strings = {"tom","cost","3","days","learning"};
        List<String> list = Arrays.asList(strings);
        return list;
    }
}
