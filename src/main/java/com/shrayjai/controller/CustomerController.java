package com.shrayjai.controller;

import com.shrayjai.entity.Customer;
import com.shrayjai.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @PostMapping("/customers")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return repository.save(customer);
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable("id") String customerId) {
        return repository.findById(customerId);
    }

    @DeleteMapping("/customers/{id}")
    public String deleteCustomerById(@PathVariable("id") String customerId) {
        return repository.deleteById(customerId);
    }

    @PutMapping("/customers/{id}")
    public String updateCustomerById(@PathVariable("id") String customerId, @RequestBody Customer customer) {
        return repository.update(customerId, customer);
    }
}
