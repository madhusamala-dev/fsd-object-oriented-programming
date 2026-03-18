package com.java.oop.interfaces;

public class UpiPayment implements Payment {
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment " + amount + "done using UPI ");
        return true;
    }

    @Override
    public boolean pay(double amount, int otp) {
        System.out.println("Payment " + amount + "done using UPI with OTP " + otp);
        return true;
    }
}
