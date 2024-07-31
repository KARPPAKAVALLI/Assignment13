package com.assignment13.code3;

public class ThrillerMovie extends Movie{
    ThrillerMovie(String title,float budget){
        super(title,budget);
    }

    @Override
    String getGenre() {
        return "This is a Thriller Movie.";
    }
    void getDetails() {
        super.getDetails();
        System.out.println("Genre:"+getGenre());
    }
}
