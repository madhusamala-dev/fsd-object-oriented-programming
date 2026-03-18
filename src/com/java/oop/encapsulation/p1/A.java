package com.java.oop.encapsulation.p1;

 public class A {
    private int value = 1000;
    public A(){
        System.out.println("A constructor");
    }
    protected void m1(){
        System.out.println("A m1");
    }

    public static void main(String[] args) {
        A a;
        a = new A();
    }
}
