package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewController {


    // application.yaml və pom.dəki embedded-tomcat lazımdır(jsp üçün)
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    // thymeleaf dependency sayəsində application.yaml və pom.dəki embedded-tomcata ehtiyac YOXDUR
    // jsp yox html yaradılmalıdır
    // webapp və altındakılara ehtiyac yoxdur
    @GetMapping("/html")
    public String htmlPage(){
        return "home";
    }

}