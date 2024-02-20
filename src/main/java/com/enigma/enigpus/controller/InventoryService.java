package com.enigma.enigpus.controller;

public interface InventoryService {
    public void addBook(int bookChoice);
    public void searchBookByTitle(int bookChoice);
    public void searchBookById(int bookChoice);
    public void deleteBook(int bookChoice);
    public void getAllBook(int bookChoice);
}
