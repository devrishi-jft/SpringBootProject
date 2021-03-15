package com.example.thymeleaf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@Controller
public class ThymeleafController {
    @GetMapping("/about")
    public String about(Model model){
        System.out.println("hello");
        model.addAttribute("name","devrishi sherawat");
        model.addAttribute("currentDate",new Date().toLocaleString());
        List<String> names= List.of("dev","rishi","sherawat");
        model.addAttribute("list",names);
        return "about";
    }
}
