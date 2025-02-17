package com.assignment13.code3;

public abstract class Movie {
    //3. Change 'Movie' class to abstract class and
    //add additional abstract methods in 'Movie' class and define them in the child classes.
    String title;
    float budget;
    Movie(String title,float budget){
        this.title=title;
        this.budget=budget;
    }
    abstract String getGenre();
    void getDetails(){
        System.out.println("Title:"+this.title);
        System.out.println("Budget:"+this.budget);
    }
}
