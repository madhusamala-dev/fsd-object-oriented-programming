package com.java.oop.abstraction;

public abstract class Payment {

    String id;
    String mode;

    Payment(){
    }

    Payment(String id, String mode){
        this.id = id;
        this.mode = mode;
    }

    abstract boolean pay(double amount);
    abstract boolean pay(double amount, int otp);
    void postOrderProcessing(){
        System.out.println("Post order processing");
    }
}
