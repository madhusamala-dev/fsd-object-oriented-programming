package com.java.oop.abstraction;

public class UpiPayment extends Payment {
    @Override
    boolean pay(double amount) {
        System.out.println("Payment " + amount + "done using UPI ");
        return true;
    }

    @Override
    boolean pay(double amount, int otp) {
        System.out.println("Payment " + amount + "done using UPI with OTP " + otp);
        return true;
    }
}
