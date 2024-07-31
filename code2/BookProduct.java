package com.assignment13.code2;

public class BookProduct extends Product{
    String author;
    BookProduct(String name,String author,float price){
        super(name,price);
        this.author=author;
    }
    @Override
    float getPrice() {
        return this.price;
    }

    @Override
    void getDescription() {
        System.out.println("Book Name:"+name);
        System.out.println("Author Name:"+author);
        System.out.println("Price:"+price);
    }
}
