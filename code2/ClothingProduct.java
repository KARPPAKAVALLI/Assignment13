package com.assignment13.code2;

public class ClothingProduct extends Product{
    String size;
    ClothingProduct(String name,float price,String size){
        super(name,price);
        this.size=size;
    }
    @Override
    float getPrice() {
        return this.price;
    }

    @Override
    void getDescription() {
        System.out.println("Name:"+name);
        System.out.println("Cloth Size:"+size);
        System.out.println("Price:"+price);
    }
}
