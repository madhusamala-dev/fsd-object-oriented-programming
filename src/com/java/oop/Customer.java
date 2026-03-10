package com.java.oop;

public class Customer {
    //state
    //instance variables
   public int id;
  public   String name;
    String email;
    String password;
    byte age;
    long mobileNo;
    char gender;
    String address;
    boolean isActive;

    //No-arg constructor
    Customer(){
        System.out.println("Constructor() is called");
        id = 101;
        name = "customer1";
        age = 27;
        gender = 'M';
        mobileNo = 234232323;
        address = "Hyderabad";
        email = "customer1@gmail.com";
        password = "customer@123";
        isActive = true;

    }

    public Customer(int id, String name, String email, String password, byte age, long mobileNo, char gender, String address, boolean isActive) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.mobileNo = mobileNo;
        this.gender = gender;
        this.address = address;
        this.isActive = isActive;
    }
}
