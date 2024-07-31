package com.assignment13.code3;

public class MovieDemo {
    public static void main(String[] args) {
        Movie m;
        m=new ActionMovie("Singam",1000053f);
        m.getDetails();
        System.out.println();

        m=new RomComMovie("The Holiday",23400f);
        m.getDetails();
        System.out.println();

        m=new ThrillerMovie("Inside",562007f);
        m.getDetails();
    }
}
