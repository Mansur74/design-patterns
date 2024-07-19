package org.example.data_access_object;

import java.util.List;

public interface BookDao {
    public List<Book> getAllBooks();
    public Book getBook(int id);
    public void create(Book book);
    public void update(Book book, int id);
}
