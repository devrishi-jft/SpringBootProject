package com.dev.ecom.assignment.service;

import com.dev.ecom.assignment.model.Customer;

import com.dev.ecom.assignment.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    Customer customer;
    @Autowired
    private CustomerRepository customerRepository;
    public void getCustomer(Customer customer) {
        System.out.println("customer inside service = " + customer);
        customerRepository.save(customer);
    }
}
