package com.dev.springoath2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
@ResponseBody
public class Oath2Controller {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/log")
    public Principal log(Principal principal){
        return principal;
    }
}
