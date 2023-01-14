package com.example.springbootcrud.service;

import com.example.springbootcrud.entity.Customer;
import com.example.springbootcrud.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Sandun Induranga
 * @since : 0.1.0
 **/

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public Customer saveCustomer(Customer customer){
        return customerRepository.save(customer);
    }

}
