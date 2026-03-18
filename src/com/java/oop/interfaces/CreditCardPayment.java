package com.java.oop.interfaces;

public class CreditCardPayment implements Payment,Process {

    @Override
    public boolean pay(double amount) {
        System.out.println("Max Limit : " + Payment.MAX_LIMIT);
        System.out.println("Payment " + amount + " done using credit card");
        return true;
    }

    @Override
    public boolean pay(double amount, int otp) {
        System.out.println("Payment " + amount + " done using credit card with OTP " + otp);
        return false;
    }
}
