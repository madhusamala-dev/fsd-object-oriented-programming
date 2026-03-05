package com.java.oop.arrays;

import java.util.List;

public class Product {

    int id;
    String name;
    int maxRetailPrice;
    float discountPercentage;
    float rating;
    boolean isStockAvailable;

    public Product() {
    }

    public Product(int id, String name, int maxRetailPrice, float discountPercentage, float rating, boolean isStockAvailable) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.isStockAvailable = isStockAvailable;
    }

    //Business methods
    public void displayProductDetails(){
        System.out.println("Product Details: ");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Max Retail Price: " + maxRetailPrice);
        System.out.println("Discount Percentage: " + discountPercentage);
        System.out.println("Rating: " + rating);
        System.out.println("Is Stock Available: " + isStockAvailable);
    }

    //get product discount amount
    public float getDiscountAmount(){
        return maxRetailPrice * discountPercentage / 100;
    }

    //get product final price
    public float getFinalPrice(){
        return maxRetailPrice - getDiscountAmount();
    }

    public List<Product>  getProductsPriceAbove(int maxRetailPrice){
        System.out.println("Get the list of products price above " + maxRetailPrice );
        return null;
    }
    public List<Product>  getProductsPriceBetween(int minPrice, int maxPrice){
        System.out.println("Get the list of products price between " + minPrice + " and " + maxPrice );
        return null;
    }

}
