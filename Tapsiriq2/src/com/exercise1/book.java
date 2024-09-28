package com.exercise1;

public  class book {
    String name;
    String authorint;
    int pageCount;

    public static void main(String[] args) {
        book FirstBook = new book();
        FirstBook.name = "The Wretched";
        FirstBook.authorint = "Victor Hugo";
        FirstBook.pageCount = 600;


        book SecondBook = new book();
        SecondBook.name = "The Transformation";
        SecondBook.authorint = "Franz Kafka";
        SecondBook.pageCount = 850;

        System.out.println("Book name : " + FirstBook.name);
        System.out.println("Author : " + FirstBook.authorint);
        System.out.println("Page count : " + FirstBook.pageCount);

        System.out.println("Book name : " + SecondBook.name);
        System.out.println("Author : " + SecondBook.authorint);
        System.out.println("Page count : " + SecondBook.pageCount);


    }
}
