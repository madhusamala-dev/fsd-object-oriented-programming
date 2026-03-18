package com.java.oop.encapsulation.p2;

import com.java.oop.encapsulation.p1.A;

public class Y extends A {
    void m2(){
        m1();
    }
    public static void main(String[] args) {
        A a;
        a = new A();
        //a.m1(); can be access only from Y
        Y y = new Y();
        y.m1();
    }
}
