package com.assignment13.code3;

public class ActionMovie extends Movie{
    ActionMovie(String title,float budget){
        super(title,budget);
    }

    @Override
   String getGenre() {
        return "This is an Action Movie.";
    }
    void getDetails() {
        super.getDetails();
        System.out.println("Genre:"+getGenre());
    }
}
