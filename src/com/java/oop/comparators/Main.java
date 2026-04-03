package com.java.oop.comparators;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepository();
        CustomerService customerService = new CustomerService(customerRepository);
        List<Customer> customersByName = customerService.sortByName();
        for(Customer customer : customersByName){
            System.out.println(customer);
        }
        System.out.println("-----------------------------");
        List<Customer> customersByPhoneNo = customerService.sortByPhoneNo();
        for(Customer customer : customersByPhoneNo){
            System.out.println(customer);
        }
    }
}
