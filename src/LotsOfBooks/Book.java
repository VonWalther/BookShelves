package LotsOfBooks;

import javafx.scene.image.Image;

public class Book {
//********Class States***********
    private String title;
    private String[] authors;
    private int numOfPages;
    private Image frontCover;

//********Constructors***********
    public Book(){
        numOfPages = 9001;

    }

    public Book(String title){

    }
    //HW Create me a function that class this constructure with pre filled in data.
    public Book(String title, String[] authors, int numOfPages) {  //Add cover image later.
        this();
        this.title = title;
    }

//********Class Behaviors********


//********Getters and Setters****


    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public int getNumOfPages() {
        return numOfPages;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
}
