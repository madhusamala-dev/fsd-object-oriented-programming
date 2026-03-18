package com.java.oop.abstraction;

public class CreditCardPayment extends Payment{
    @Override
    boolean pay(double amount) {
        System.out.println("Payment " + amount + " done using credit card");
        return true;
    }

    @Override
    boolean pay(double amount, int otp) {
        System.out.println("Payment " + amount + " done using credit card with OTP " + otp);
        return true;
    }
}
