package org.example.data_access_object;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImp implements BookDao {

    //db
    List<Book> books = new ArrayList<>();

    @Override
    public List<Book> getAllBooks() {
        books.stream().forEach(book -> System.out.println(book.getName()));
        return books;
    }

    @Override
    public Book getBook(int id) {
        Book foundedBook = books.get(id);
        System.out.println(foundedBook.getName());
        return foundedBook;
    }

    @Override
    public void create(Book book) {
        books.add(book);
    }

    @Override
    public void update(Book book, int id) {
        Book foundedBook = books.get(id);
        foundedBook.setAuthor(book.getAuthor());
        System.out.println(foundedBook.getAuthor());
    }
}
