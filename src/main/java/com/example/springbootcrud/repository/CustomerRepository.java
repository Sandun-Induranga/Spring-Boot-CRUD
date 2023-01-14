package com.example.springbootcrud.repository;

import com.example.springbootcrud.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Sandun Induranga
 * @since : 0.1.0
 **/

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
