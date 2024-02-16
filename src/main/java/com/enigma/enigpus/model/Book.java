package com.enigma.enigpus.model;

public abstract class Book {
    public String bookId;
    public String title;
    public String yearOfPublish;

    Book(String bookId, String title, String yearOfPublish){
        this.bookId = bookId;
        this.title = title;
        this.yearOfPublish = yearOfPublish;
    }

    public abstract String getTitle();
    public abstract String getBookId();
    public abstract String getYearOfPublish();
    public abstract void setBookId(String bookId);
    public abstract void setTitle(String title);
    public abstract void setYearOfPublish(String yearOfPublish);
}
