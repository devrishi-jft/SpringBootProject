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

    public List<Product> setProduct(Product product) {
        productRepository.save(product);
        return productRepository.findAll();
    }

    public List<Product> getProduct(){
        return productRepository.findAll();
    }
    public List<Product> setProductById(Product product){
        productRepository.save(product);
        return productRepository.findAll();
    }

    public Product getProduct(int id){
        return productRepository.findById(id).get();
    }

    public void deleteProduct(int id){
        productRepository.deleteById(id);
    }
}
