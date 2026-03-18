package com.java.oop.interfaces;

public class Main {

    public static void main(String[] args) {

       // Payment payment = new CreditCardPayment();
        // Payment payment = new DebitCardPayment();

        Payment payment = new UpiPayment();
        OrderService order = new OrderService(payment);
        order.processOrder(1000.0,123456);
    }
}
