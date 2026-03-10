package com.java.oop.strings;

import com.java.oop.Customer;

public class Main {
    public static void main(String[] args) {
        //API Ways of creating String objects
        String str1 = new String();
        System.out.println(str1);
        String str2 = new String("abcd");
        System.out.println(str2);
        String str3 = new String("abcd");
        System.out.println(str3);

        String str4 = "abcd"; //String literals
        System.out.println(str4);
        String str5 = "abcd";
        System.out.println(str5);

        System.out.println(str2 == str3); //reference comparision (not data comparision)
        System.out.println(str4 == str5);
        char[] chs = {'a','b','c','d','e'};
        //array of characters
        String str6 = new String(chs);
        System.out.println(str6);
        String email = "    john@example.com     ";

        System.out.println(str6.charAt(3));
        System.out.println(email.compareTo("john@example.com"));
        System.out.println(email.compareToIgnoreCase("John@Example.Com"));

        String hello = "Hello, ";
        //Java String objects are immutable
        System.out.println(hello.concat(email));
        System.out.println(email);
        System.out.println(hello);
        String password = "Cust1@123";


        System.out.println(email.endsWith(".com"));
        if(email.trim().equalsIgnoreCase("John@example.com") && password.equals("Cust1@123"))
            System.out.println("login successful");
        else
            System.out.println("Invalid credentials");

        System.out.println(email.length());
        //String manipulation
        // Password validation rule
        /*
        1. Empty
        2. min and max length
        3. pattern

         */
        System.out.println(password.isEmpty());
        System.out.println(password.length() > 8 && password.length() < 16);
        System.out.println(password.matches("^[a-zA-Z0-9@]{8,16}$"));

        String customerData = "001,Madhu Samala,madhu@gmail.com,madhu@1234,40,98723423,M, Hyderabad, true";

        //convert this data into a Customer Object
        String[] split = customerData.split(",");
        Customer customer = new Customer(Integer.parseInt(split[0]), split[1], split[2], split[3], Byte.parseByte(split[4]), Long.parseLong(split[5]), split[6].charAt(0), split[7], Boolean.parseBoolean(split[8]));

        System.out.println(customer.name);
    }
}
