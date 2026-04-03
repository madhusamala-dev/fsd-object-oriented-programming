package com.java.oop.comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerRepository {

    private List<Customer> customers;

    public CustomerRepository() {
        customers = new ArrayList(List.of(
                new Customer(1, "Amit Sharma", "amit.sharma@gmail.com", "pass123", 9876543210L, true),
                new Customer(2, "Priya Reddy", "priya.reddy@gmail.com", "priya@123", 9123456780L, true),
                new Customer(3, "Rahul Verma", "rahul.verma@gmail.com", "rahul@456", 9988776655L, false),
                new Customer(4, "Sneha Kapoor", "sneha.kapoor@gmail.com", "sneha789", 9871234567L, true),
                new Customer(5, "Arjun Mehta", "arjun.mehta@gmail.com", "arjun@321", 9765432109L, true),
                new Customer(6, "Neha Singh", "neha.singh@gmail.com", "neha@654", 9012345678L, false),
                new Customer(7, "Kiran Kumar", "kiran.kumar@gmail.com", "kiran@987", 9090909090L, true),
                new Customer(8, "Pooja Nair", "pooja.nair@gmail.com", "pooja@111", 9345678901L, true),
                new Customer(9, "Vikram Rao", "vikram.rao@gmail.com", "vikram@222", 9234567890L, false),
                new Customer(10, "Anjali Gupta", "anjali.gupta@gmail.com", "anjali@333", 9878901234L, true)

        ));

    }
    public List<Customer> getAll(){
            return customers;
    }
}
