package com.java.oop.comparators;

import java.util.Collections;
import java.util.List;

public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> sortByName(){
        List<Customer> customers = this.customerRepository.getAll();
        customers.sort(new CustomerNameComparator());
        return customers;
    }

    public List<Customer> sortByPhoneNo(){
        List<Customer> customers = this.customerRepository.getAll();
        customers.sort(new CustomerPhoneNoComparator());
        return customers;
    }
}
