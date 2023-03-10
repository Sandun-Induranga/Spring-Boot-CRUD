package com.example.springbootcrud.controller;

import com.example.springbootcrud.entity.Customer;
import com.example.springbootcrud.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Sandun Induranga
 * @since : 0.1.0
 **/

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/saveCustomer")
    public boolean saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/getAllCustomers")
    public List<Customer> getAllCustomers(){
        List<Customer> allCustomers = customerService.getAllCustomers();
        for (Customer customer : allCustomers) {
            System.out.println(customer);
        }
        return allCustomers;
    }

    @PutMapping("/updateCustomer")
    public boolean updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/deleteCustomer")
    public boolean deleteCustomer(@RequestBody Customer customer){
        return customerService.deleteCustomer(customer);
    }

}
