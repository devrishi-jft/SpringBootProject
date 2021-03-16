package com.dev.ecom.assignment.service;

import com.dev.ecom.assignment.model.Product;
import com.dev.ecom.assignment.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    Product product;
    @Autowired
    ProductRepository productRepository;
    public void setProduct(Product product) {
        productRepository.save(product);
    }
    public List<Product> getProduct(){
        return productRepository.findAll();
    }
    public void deleteProduct(int id){
        productRepository.deleteById(id);
    }
}
