package org.example.data_access_object;

public class Book {
    private int id;
    private String name;
    private String author;
    private int editionYear;

    public Book(int id, String name, String author, int editionYear) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.editionYear = editionYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getEditionYear() {
        return editionYear;
    }

    public void setEditionYear(int editionYear) {
        this.editionYear = editionYear;
    }
}
