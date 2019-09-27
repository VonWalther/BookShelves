package LotsOfBooks;

public class BookShelf {
//********Class States***********

    private Book[][] aBookShelf;
    private final int NUM_OF_SHELVES = 5;
    private final int BOOKS_PER_SHELF = 20;

//********Constructors***********
    public BookShelf(){
        aBookShelf = new Book[NUM_OF_SHELVES][BOOKS_PER_SHELF];
        fillBookShelf(25);
        System.out.print(getLength(aBookShelf));
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
        for(int i = 0; i < numOfBooks; i++){
            int x = (int)(Math.random()*NUM_OF_SHELVES);
            int y = (int)(Math.random()*BOOKS_PER_SHELF);
            //in case the spot is already taken, it will try to find a new spot for it
            if(aBookShelf[x][y] != null){
                fillBookShelf(1);
            }
            else{
                aBookShelf[x][y] = new Book();
            }
            //amount of books in array should now always be equal to numOfBooks
        }
    }

    //finds how many non null variables are in an array
    public static int getLength(Book[][] arr){

        int count = 0;
        for(Book[] a : arr) {
            for (Book b : a) {
                if (b != null)
                    ++count;
            }
        }
        return count;
    }

    //********Getters and Setters****
}





