package com.java.oop.strings;

public class Product {
    String id;
    String name;
    double maxRetailPrice;
    float discountPercentage;

    public Product(String id, String name, double maxRetailPrice, float discountPercentage) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
    }

    public void displayProductDetails(){
        System.out.println("----------------------------------------------------------------- ");
        System.out.printf("%-10s %-30s %-15.2f %-15.2f\n", id, name, maxRetailPrice, discountPercentage);
    }
}
