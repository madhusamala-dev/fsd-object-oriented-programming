package com.java.oop.interfaces;

public class DebitCardPayment implements Payment {

    @Override
    public boolean pay(double amount) {
        System.out.println("Payment : " + amount + " done using debit card");
        return true;
    }

    @Override
    public boolean pay(double amount, int otp) {
        System.out.println("Payment : " + amount + " done using debit card with OTP " + otp);
        return true;
    }
}
