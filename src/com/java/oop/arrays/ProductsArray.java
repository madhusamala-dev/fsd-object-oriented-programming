package com.java.oop.arrays;

public class ProductsArray {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(101,"product1",1000,10,5,true);
        products[1] = new Product(102,"product2",2000,20,4,false);
        products[2] = new Product(103,"product3",3000,30,3,true);
        products[3] = new Product(104,"product4",4000,40,2,false);
        products[4] = new Product(105,"product5",5000,50,1,true);

        //index based for loop
        for(int i = 0; i < products.length; i++){

            products[i].discountPercentage += 5;
            System.out.println("Id : " + products[i].id);
            System.out.println("Name : " + products[i].name);
            System.out.println("Max Retail Price : " + products[i].maxRetailPrice);
            System.out.println("Discount Percentage : " + products[i].discountPercentage);
            System.out.println("Rating : " + products[i].rating);
            System.out.println("Is Stock Available : " + products[i].isStockAvailable);

        }

        //foreach loop
        System.out.println("foreach loop");
        for(Product product : products){
            System.out.println("Id : " + product.id);
            System.out.println("Name : " + product.name);
            System.out.println("Max Retail Price : " + product.maxRetailPrice);
            System.out.println("Discount Percentage : " + product.discountPercentage);
            System.out.println("Rating : " + product.rating);
            System.out.println("Is Stock Available : " + product.isStockAvailable);
        }



        int[] ids = new int[5];
        ids[0] = 101;
        ids[1] = 102;
        ids[2] = 103;
        ids[3] = 104;
        ids[4] = 105;

    }
}
