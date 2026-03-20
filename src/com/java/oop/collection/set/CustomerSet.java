package com.java.oop.collection.set;

import com.java.oop.model.Customer;

import java.util.HashSet;
import java.util.Iterator;

public class CustomerSet {
    public static void main(String[] args) {
        HashSet<Customer> customers = new HashSet<>();
        Customer customer1 = new Customer();
        customer1.setId(101).setName("customer1").setEmail("customer1@gmail.com").setPhoneNo(9876543210L).setActive(true).setPassword("Abcd@1234");
        Customer customer2 = new Customer();
        customer2.setId(102).setName("customer2").setEmail("customer2@gmail.com").setPhoneNo(9876543210L).setActive(false).setPassword("hello@1234");
        Customer customer3 = new Customer();
        customer3.setId(103).setName("customer3").setEmail("customer3@gmail.com").setPhoneNo(9876543210L).setActive(true).setPassword("Abcd@1234");
        Customer customer4 = new Customer();
        customer4.setId(101).setName("customer1").setEmail("customer1@gmail.com").setPhoneNo(9876543210L).setActive(true).setPassword("Abcd@1234");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);

        System.out.println(customers);

        Iterator<Customer> iterator = customers.iterator();
        Customer customer = null;
        CustomerService customerService = new CustomerService();
        while(iterator.hasNext()){
            customer = iterator.next();
            customerService.displayCustomer(customer);
        }

    }
}
