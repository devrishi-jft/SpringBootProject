package com.dev.ecom.assignment.controller;

import com.dev.ecom.assignment.model.Customer;
import com.dev.ecom.assignment.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/shopping")
public class CartController {
    @Autowired
    Customer customer;
    @Autowired
    CartService cartService;

    @GetMapping
    public String home() {
        System.out.println("home");
        return "home";
    }

    @GetMapping("/reg")
    public String reg() {
        return "registration";
    }

    @GetMapping("/registered")
    public String registered(
            @RequestParam(required = false) String id,
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("password") String password
    ) {
        customer.setName(name);
        customer.setEmail(email);
        customer.setPassword(password);
        System.out.println(customer);
        cartService.getCustomer(customer);
        return "home";
    }

}
