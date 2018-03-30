package exercise101_LibraryInformationSystem;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void printBooks() {
        for(Book b: books){
            System.out.println(b);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<>();
        for(int i = 0; i < books.size(); i++){
            if(StringUtils.included(books.get(i).title(), title)){
                found.add(books.get(i));
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if(StringUtils.included(books.get(i).publisher(), publisher)) {
                found.add(books.get(i));
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).year() == year) {
                found.add(books.get(i));
            }
        }
        return found;
    }
}
