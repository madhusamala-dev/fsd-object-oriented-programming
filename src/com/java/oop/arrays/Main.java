package com.java.oop.arrays;

public class Main {
    public static void main(String[] args) {
        int[] ids ; //array declaration (reference variable)
        ids = new int[5];// array creation ( array will be creaed)
        System.out.println(ids[0]);
        ids[0] = 101; //access array elements based on index
        ids[1] = 102;
        ids[2] = 103;
        ids[3] = 104;
        ids[4] = 105;

        System.out.println(ids[2]);

        //for loop ( to access all array elements)
        for(int i = 0; i < ids.length; i++){
            System.out.println(ids[i]);
        }

        //to access all array elements using foreach loop
        for(int id : ids){
            System.out.println(id);
        }

        //updating ids

        for(int i = 0; i < ids.length; i++){
            ids[i] += 10000;
        }
        /*for(int id : ids){
            id += 10000;
        }*/


        System.out.println("After updating ids:");
        for(int id : ids){
            System.out.println(id);
        }
        char[] chs = {'a','b','c','d','e'}; //an array of 5 characters will be created

        //index based for loop

        for(int i = 0; i < chs.length; i++){
            System.out.println(chs[i]);
        }

        //foreach loop
        for(char ch : chs){
            System.out.println(ch);
        }
    }
}
