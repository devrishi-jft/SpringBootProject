package com.dev.ecom.assignment.controller;

import com.dev.ecom.assignment.model.Product;
import com.dev.ecom.assignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class ProductController {
    @Autowired
    Product product;
    @Autowired
    ProductService productService;

    @GetMapping("/adminHome")
    public String adminHome(Model model){
        List<Product> products=productService.getProduct();
        model.addAttribute("listOfProducts",products);
        return "adminHome";
    }

    @GetMapping("/addForm")
    public String getProducts(){
       return "newProduct";
    }
    @PostMapping("/addProduct")
    public String addProduct(

            @RequestParam(required = false) String id,
            @RequestParam("name") String name,
            @RequestParam("brand") String brand,
            @RequestParam("price") Float price,
            Model model
        ){
        product.setName(name);
        product.setBrand(brand);
        product.setPrice(price);
        System.out.println(product);
        List<Product> products=productService.setProduct(product);
        model.addAttribute("listOfProducts",products);
        return "adminHome";
    }

    @PostMapping("/edit/{id}")
    public ModelAndView editProduct(
            @PathVariable("id") int id
    ){
        Product product=productService.getProduct(id);
        ModelAndView mv=new ModelAndView();
        mv.addObject("product",product);
        mv.setViewName("editProduct");
        return mv;
    }
    @PostMapping("/editProduct2")
    public String editProduct2(

            @RequestParam(required = false) String id,
            @RequestParam("name") String name,
            @RequestParam("brand") String brand,
            @RequestParam("price") Float price,
            Model model
    ){
        product.setName(name);
        product.setBrand(brand);
        product.setPrice(price);
        System.out.println(product);
        List<Product> products=productService.setProductById(product);
        model.addAttribute("listOfProducts",products);
        return "adminHome";
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable("id") int id) {
        productService.deleteProduct(id);
        return "adminHome";

    }
}
