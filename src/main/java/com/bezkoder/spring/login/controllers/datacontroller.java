package com.bezkoder.spring.login.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class datacontroller {

    @RequestMapping("/")
    public String indexPage(){
        return "index";
    }

    
}