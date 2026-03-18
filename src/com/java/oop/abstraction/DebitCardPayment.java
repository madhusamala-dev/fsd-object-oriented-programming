package com.java.oop.abstraction;

public class DebitCardPayment extends Payment {

    @Override
    boolean pay(double amount) {
        System.out.println("Payment : " + amount + " done using debit card");
        return true;
    }

    @Override
    boolean pay(double amount, int otp) {
        System.out.println("Payment : " + amount + " done using debit card with OTP " + otp);
        return true;
    }
}
