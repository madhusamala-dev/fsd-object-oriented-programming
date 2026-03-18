package com.java.oop.interfaces;

public interface Payment {
    int MAX_LIMIT = 23423423;
    int MAX_ATTEMPTS = 3;

    boolean pay(double amount);
    boolean pay(double amount, int otp);
    static void postOrderProcessing(){
       System.out.println("Post order processing");
   }
}
