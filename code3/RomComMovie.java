package com.assignment13.code3;

public class RomComMovie extends Movie{
    RomComMovie(String title,float budget){
        super(title,budget);
    }

    @Override
    String getGenre() {
        return "This is a Rom Com Movie.";
    }

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Genre:"+getGenre());
    }
}
