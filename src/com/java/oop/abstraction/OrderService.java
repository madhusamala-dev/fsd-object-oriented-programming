package com.java.oop.abstraction;

public class OrderService {

    Payment payment;

    OrderService(Payment payment){
        this.payment = payment;
    }

    public void processOrder(double amount) {
        payment.pay(amount);
        payment.postOrderProcessing();
    }
    public void processOrder(double amount, int otp) {
        payment.pay(amount, otp);
        payment.postOrderProcessing();
    }


}
