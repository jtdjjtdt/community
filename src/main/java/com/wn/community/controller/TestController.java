package com.wn.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/test")
public class TestController {

    @GetMapping(path = "hello")
    public String hello(){
        return "hello";
    }

    @GetMapping(path = "index")
    public String index(){
        return "index";
    }
}
