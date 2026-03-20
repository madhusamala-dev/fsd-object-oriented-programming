package com.java.oop.interfaces;

public class OrderService {

    Payment payment;

    OrderService(Payment payment){
        this.payment = payment;
    }

    public void processOrder(double amount) {
        payment.pay(amount);
        Payment.postOrderProcessing();

    }
    public void processOrder(double amount, int otp) {
        payment.pay(amount, otp);
        Payment.postOrderProcessing();

    }


}
