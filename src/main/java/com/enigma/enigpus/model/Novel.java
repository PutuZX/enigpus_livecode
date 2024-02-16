package com.enigma.enigpus.model;

public class Novel extends Book {
    private String publisher;
    private String author;

    Novel(String bookId, String title, String publisher, String yearOfPublish, String author){
        super(bookId, title, yearOfPublish);
        this.publisher = publisher;
        this.author = author;
    }

    public String getPublisher(){
        return this.publisher;
    }

    public String getYearOfString(){
        return this.yearOfPublish;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public void setYearOfString(String yearOfPublish){
        this.yearOfPublish = yearOfPublish;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    @Override
    public String getBookId() {
        return this.bookId;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getYearOfPublish() {
        return this.yearOfPublish;
    }

    @Override
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setYearOfPublish(String yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }
}
