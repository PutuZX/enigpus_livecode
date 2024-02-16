package com.enigma.enigpus.model;

public class Magazine extends Book{
    private String publishPeriod;

    public Magazine(String bookId, String title, String yearOfPublish, String publishPeriod){
        super(bookId, title, yearOfPublish);
        this.publishPeriod = publishPeriod;
    }

    public String getPublishPeriod(){
        return this.publishPeriod;
    }

    public void setPublishPeriod(String publishPeriod){
        this.publishPeriod = publishPeriod;
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

    public String toString(){
        return String.format("%s %s %s %s", bookId, title, yearOfPublish, publishPeriod);
    }

    public static Magazine fromString(String str){
        String[] parts = str.split(",");
        return new Magazine(parts[0], parts[1], parts[2], parts[3]);
    }
}
