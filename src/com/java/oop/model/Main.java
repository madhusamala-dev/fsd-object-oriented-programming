package com.java.oop.model;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(101)
                .setName("customer1")
                .setEmail("customer1@gmail.com")
                .setPhoneNo(9876543210L)
                .setActive(true)
                .setPassword("customer@123");

        System.out.println("Customer Details:");
        System.out.println("ID: " + customer.getId());
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Phone No: " + customer.getPhoneNo());
        System.out.println("Active: " + customer.isActive());
        System.out.println(customer);

        Customer customer2 = new Customer();
        customer2.setId(102).setName("Customer2").setPassword("customer2@123");



    }
}
