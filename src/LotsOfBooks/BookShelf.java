package LotsOfBooks;
public class BookShelf {
//********Class States***********

    private Book[][] aBookShelf;
    private final int NUM_OF_SHELVES = 5;
    private final int BOOKS_PER_SHELF = 20;
//********Constructors***********
    public BookShelf(){
        aBookShelf = new Book[NUM_OF_SHELVES][BOOKS_PER_SHELF];
        fillBookShelf();
    }

//********Class Behaviors********

    //Fill the bookshelf full of books.
    public void fillBookShelf(){
        /*
        aBookShelf.length --> array or array of books
        aBookShelf[1].length --> array of books
        aBookShelf[1][4] --> a book
        */
        for(int i = 0; i < aBookShelf.length; i++){
            for(int j = 0; j < aBookShelf[i].length; j++){
                aBookShelf[i][j] = new Book();
            }
        }

    }

    //Adds X books to the in random order.
    public void fillBookShelf(int numOfBooks){

    }


//********Getters and Setters****


}
