package com.luv2code.springboot.thymeleafDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class DemoController {

    //create a mapping for "hello"

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("currentDate",new Date());
        return "helloworld"; //html file name
    }
}
