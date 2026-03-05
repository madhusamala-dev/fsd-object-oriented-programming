package com.java.oop;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Object
        int x = 0;
        System.out.println(x);

        Customer customer = new Customer(101,"customer1","customer1@gmail.com","customer1@123",(byte)27,435345434L,'M',"Hyderabad",true);
        //customer -> reference variable
        //Customer (datatype)
        /*customer.id = 101;
        customer.name = "customer1";
        customer.age = 27;
        customer.gender = 'M';
        customer.mobileNo = 234232323;
        customer.address = "Hyderabad";
        customer.email = "customer1@gmail.com";
        customer.password = "customer@123";
        customer.isActive = true;
*/

        System.out.println("Id: " + customer.id);
        System.out.println("Name: " + customer.name);
        System.out.println("Gender: " + customer.gender);


        Customer customer2 = new Customer(102,"Customer2","customer2@gmail.com","customer2@123",(byte)25,63453423L,'F',"Secunderabad",false);

       /* customer2.id = 102;
        customer2.name = "customer2";
        customer2.age = 28;
        customer2.gender = 'F';
        customer2.mobileNo = 334232323;
        customer2.address = "Secunderabad";
        customer2.email = "customer2@gmail.com";
        customer2.password = "customer2@123";
        customer2.isActive = false;*/
        System.out.println("Id: " + customer2.id);
        System.out.println("Name: " + customer2.name);
        System.out.println("Gender: " + customer2.gender);

        Customer customer3 = new Customer();


        Product product = new Product(101,"Lenovo laptop",2342323,5.4F,4.5F,true);
        product.displayProductDetails();
        /*float discountAmount = product.getDiscountAmount();
        System.out.println("Discount Amount: " + discountAmount);*/
        System.out.println("Discount Amount: " + product.getDiscountAmount());
        System.out.println("Final Price: " + product.getFinalPrice());
        List<Product> productsListPriceAbove = product.getProductsPriceAbove(2342323);
        List<Product> productsListPriceBetween = product.getProductsPriceBetween(2342323, 2342323);
    }
}
