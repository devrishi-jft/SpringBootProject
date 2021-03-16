package com.dev.ecom.assignment.controller;

import com.dev.ecom.assignment.model.Customer;
import com.dev.ecom.assignment.model.Product;
import com.dev.ecom.assignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class ProductController {
    @Autowired
    Product product;
    @Autowired
    ProductService productService;
    @GetMapping
    public String adminHome(){
       return "product";
    }
    @GetMapping("/addProduct")
    public String addProduct(

            @RequestParam(required = false) String id,
            @RequestParam("name") String name,
            @RequestParam("brand") String brand,
            @RequestParam("price") Float price
        ){
        product.setName(name);
        product.setBrand(brand);
        product.setPrice(price);
        System.out.println(product);
        productService.setProduct(product);
        return "home";
    }
    @GetMapping("/getProduct")
    public String getProducts(Model model){
        List<Product> products=productService.getProduct();
        model.addAttribute("listOfProducts",products);
        return "showproducts";
    }
    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable("id") int id) {
        productService.deleteProduct(id);
        return "ahowproducts";

    }
}
