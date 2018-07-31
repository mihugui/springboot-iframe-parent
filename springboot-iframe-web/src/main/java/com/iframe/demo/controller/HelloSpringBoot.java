package com.iframe.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloSpringBoot {

    @RequestMapping(value="/hello")
    @ResponseBody
    public String say(){
        return "index";
    }
}
