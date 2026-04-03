package com.java.oop.comparators;

import java.util.Comparator;

public class CustomerPhoneNoComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer c1, Customer c2) {
        return Long.compare(c1.getPhoneNo(), c2.getPhoneNo());
    }
}
