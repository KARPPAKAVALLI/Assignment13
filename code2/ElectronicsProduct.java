package com.assignment13.code2;

public class ElectronicsProduct extends Product{
    String brand;
    ElectronicsProduct(String name,String brand,float price){
        super(name,price);
        this.brand=brand;
    }
    @Override
    float getPrice() {
        return this.price;
    }

    @Override
    void getDescription() {
        System.out.println("Name:"+name);
        System.out.println("Brand name:"+brand);
        System.out.println("Price:"+price);
    }
}
