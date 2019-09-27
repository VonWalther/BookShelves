package com.company;

import java.io.*;
import java.util.Scanner;

public class BookShelf<temp> {

    Book[][] oneBookShelf;
    final int NUM_OF_SHELVES = 5;
    final int BOOKS_PER_SHELF = 20;
    File booksData;
    Scanner booksInput;
    String littleWords;
    String bigWords;
    String firstNames;
    String lastNames;
    String[] smallWords;
    String[] largeWords;
    String[] bNames;
    String[] lNames;

    public BookShelf() throws FileNotFoundException {
        booksData = new File("books.txt");
        booksInput = new Scanner(booksData);
        oneBookShelf = new Book[NUM_OF_SHELVES][BOOKS_PER_SHELF];

        readInBooksData();
        fillBookShelf();
    }

    public void fillBookShelf() {
        for (int i = 0; i < oneBookShelf.length; i++) {
            for (int j = 0; j < oneBookShelf[i].length; j++) {
                Book temp = getStuff();
                oneBookShelf[i][j] = temp;
                System.out.println(temp.getTitle() + " by " + temp.getAuthor());
            }
        }
    }

    public void fillBookShelf(int numOfBooks) {

    }

    public void readInBooksData() {
        String commas = ",";
        while (booksInput.hasNext()) {
            littleWords = booksInput.nextLine();
            smallWords = littleWords.split(commas);
            bigWords = booksInput.nextLine();
            largeWords = bigWords.split(commas);
            firstNames = booksInput.nextLine();
            bNames = firstNames.split(commas);
            lastNames = booksInput.nextLine();
            lNames = lastNames.split(commas);
        }
    }

    public Book getStuff() {
        String bookTitle = null;
        String authorName = null;
        Book temp;
        double x;
        double y;
        double z;
        double zz;
        double xx;
        double yy;

        x = Math.random() * smallWords.length;
        y = Math.random() * largeWords.length;
        xx = Math.random() * smallWords.length;
        yy = Math.random() * largeWords.length;
        z = Math.random() * bNames.length;
        zz = Math.random() * lNames.length;
        String thisName = smallWords[(int) x] + " " + largeWords[(int) y] + " " + smallWords[(int) xx] + " " + largeWords[(int) yy];
        String thisAuthor = bNames[(int) z] + " " + lNames[(int) zz];
        temp = new Book(thisName, thisAuthor);
        return temp;
    }

}
