package com.assignment13.code2;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductDemo {
    public static void main(String[] args) {
        ArrayList<BookProduct>books=new ArrayList<>(Arrays.asList(new BookProduct("Percy Jackson","Rick Riordan",250),
                new BookProduct("Harry Potter","JK Rowling",200.10f),
                new BookProduct("AGGGTM","Holly Jackson",210)));

        ArrayList<ClothingProduct> clothes=new ArrayList<>(Arrays.asList(new ClothingProduct("Shirt",521.23f,"XS"),
                new ClothingProduct("Jeans",700,"S"),
                new ClothingProduct("T Shirt",250.5f,"XS")));

        ArrayList<ElectronicsProduct> electronics=new ArrayList<>(Arrays.asList(new ElectronicsProduct("Mobile","Nothing",15000f),
                new ElectronicsProduct("Charger","Samsung",1500.20f),
                new ElectronicsProduct("Laptop","Dell",45000)));
        float total=0;
        System.out.println("BOOKS:");
        for (Product p:books) {
            p.getDescription();
            total+=p.getPrice();
            System.out.println();
        }
        System.out.println("Total Books price:"+total);

        System.out.println("--------------------------");
        System.out.println("CLOTHES");
        for (Product p:clothes) {
            p.getDescription();
            total+=p.getPrice();
            System.out.println();
        }
        System.out.println("Total Clothes price:"+total);

        System.out.println("--------------------------");
        System.out.println("ELECTRONICS");
        for (Product p:electronics) {
            p.getDescription();
            total+=p.getPrice();
            System.out.println();
        }
        System.out.println("Total Electronics price:"+total);
    }
}
