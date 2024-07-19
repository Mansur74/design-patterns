package org.example.data_access_object;

public class Client {
    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImp();
        Book book = new Book(0,"Don Kisot", "Zort", 1900);
        Book book2 = new Book(0,"asdfasf", "Zort", 1900);

        bookDao.create(book);
        bookDao.create(book2);

        bookDao.getAllBooks();

        bookDao.getBook(0);

        book.setAuthor("Yazar");
        bookDao.update(book,0);
    }
}
