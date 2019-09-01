package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "hello world";
    }
    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        return "hello world";
    }
}
