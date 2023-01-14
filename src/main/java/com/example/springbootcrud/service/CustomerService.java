package com.example.springbootcrud.service;

import com.example.springbootcrud.entity.Customer;
import com.example.springbootcrud.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Sandun Induranga
 * @since : 0.1.0
 **/

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public boolean saveCustomer(Customer customer) {

        customerRepository.save(customer);
        return true;

    }

    public List<Customer> getAllCustomers() {

        return customerRepository.findAll();

    }

    public boolean updateCustomer(Customer customer) {

        Customer oldCustomer = customerRepository.findById(customer.getCustomerId()).orElse(null);
        if (oldCustomer != null) {
            oldCustomer.setCustomerName(customer.getCustomerName());
            oldCustomer.setAddress(customer.getAddress());
            oldCustomer.setSalary(customer.getSalary());
            return true;
        }
        return false;

    }

    public boolean deleteCustomer(Customer customer) {

        customerRepository.delete(customer);
        return true;

    }

}
