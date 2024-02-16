package com.enigma.enigpus.controller;

public interface InventoryService {
    public void addBook(int bookChoice);
    public void searchBookByTitle();
    public void searchBookById();
    public void deleteBook();
    public void getAllBook(int bookChoice);
}
