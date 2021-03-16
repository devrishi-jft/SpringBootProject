package com.dev.ecom.assignment.repo;

import com.dev.ecom.assignment.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer > {

}
