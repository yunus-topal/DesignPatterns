package Proxy;

import java.util.ArrayList;

public class Library implements LibraryService {
    private static ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book b){
        books.add(b);
        System.out.println(b.getName() + " added successfully.");
    }

    public void viewBook(Book book, Person p){
        for(Book b: books){
            if(b.getId() == book.getId()){
                System.out.println("book name: " + b.getName() + " viewed by: " + p.getName());
            }
        }
    }
}
