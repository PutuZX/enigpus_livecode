package com.enigma.enigpus.view;

import java.util.Scanner;

import com.enigma.enigpus.collection.dataCollection;
import com.enigma.enigpus.controller.InventoryServiceImpl;
import com.enigma.enigpus.model.Magazine;
import com.enigma.enigpus.model.MagzController;
import com.enigma.enigpus.model.Novel;
import com.enigma.enigpus.model.NovelController;
import com.enigma.enigpus.util.Format;
import com.enigma.enigpus.util.Validator;

public class UI {
    MagzController magazines = MagzController.getInstance();
    NovelController novels = NovelController.getInstance();
    Scanner input = new Scanner(System.in);

    public void menu() {
        InventoryServiceImpl service = new InventoryServiceImpl();
        dataCollection list = new dataCollection();
        list.readBookFile();
        System.out.println("------------------------");
        System.out.println("Welcome to Enigpus");
        System.out.println("------------------------");
        System.out.println("What can i help you?");
        System.out.println("1.Adding Book");
        System.out.println("2.Search Book by Title");
        System.out.println("3.Search Book by Id");
        System.out.println("4.Delete Book");
        System.out.println("5.Display All Book");
        System.out.print("Input: ");
        int inputValue = input.nextInt();
        service.serviceController(inputValue);
    }

    public void displayNovel(){
        System.out.println("------------------------");
        System.out.println("Display Novel Page");
        System.out.println("------------------------");
        for(Novel novel : novels.getNovels()){
            System.out.println(novel);
        }
    }
    
    public void displayMagazine(){
        System.out.println("------------------------");
        System.out.println("Display Magazine Page");
        System.out.println("------------------------");
        for(Magazine magazine : magazines.getMagazines()){
            System.out.println(magazine);
        }
    }

    public void addNovel() {
        Format format = new Format();
        System.out.println("------------------------");
        System.out.println("Adding Novel Page");
        System.out.println("------------------------");
        System.out.print("Input the book's title: ");
        input.nextLine();
        String title = input.nextLine();
        System.out.print("Input the publisher: ");
        String publisher = input.nextLine();
        System.out.print("Input the published year: ");
        String year = input.nextLine();
        System.out.print("Input the book's author: ");
        String author = input.nextLine();
        novels.addNovel(new Novel(format.bookFormatting(1, year), title, publisher, year, author));
        novels.getNovel(0);
        System.out.println(novels.getNovel(0));
    }

    public void addMagazine(){
        Format format = new Format();
        System.out.println("------------------------");
        System.out.println("Adding Magazine Page");
        System.out.println("------------------------");
        System.out.print("Input the book's title: ");
        input.nextLine();
        String title = input.nextLine();
        System.out.print("Input published period: ");
        String publishedPeriod = input.nextLine();
        System.out.print("Input the published year: ");
        String year = input.nextLine();
        magazines.addMagazine(new Magazine(format.bookFormatting(2, year), title, year, publishedPeriod));
    }

    public int bookTypeUI() {
        Validator validator = new Validator();
        System.out.println("Choose your book type");
        System.out.println("1.Novel");
        System.out.println("2.Magazine");
        System.out.print("Input: ");
        int inputValue = validator.intValidator(input);
        return inputValue;
    }

    public String novelTitleUI(){
        System.out.println("------------------------");
        System.out.println("Search Novel by Title");
        System.out.println("------------------------");
        System.out.print("Input the novel title: ");
        input.nextLine();
        String novelTitle = input.nextLine();
        return novelTitle;
    }

    public String magzTitleUI(){
        System.out.println("------------------------");
        System.out.println("Search Magazine by Title");
        System.out.println("------------------------");
        System.out.print("Input the magazine title: ");
        input.nextLine();
        String magazineTitle = input.nextLine();
        return magazineTitle;
    }

    public String novelIDUI(){
        System.out.println("------------------------");
        System.out.println("Search Novel by ID");
        System.out.println("------------------------");
        System.out.print("Input the novel ID: ");
        input.nextLine();
        String novelID = input.nextLine();
        return novelID;
    }

    public String magzIDUI(){
        System.out.println("------------------------");
        System.out.println("Search Magazine by ID");
        System.out.println("------------------------");
        System.out.print("Input the magazine ID: ");
        input.nextLine();
        String magazineID = input.nextLine();
        return magazineID;
    }

    public String magzDelete(){
        System.out.println("------------------------");
        System.out.println("Delete Magazine by ID");
        System.out.println("------------------------");
        for(Magazine magazine : magazines.getMagazines()){
            System.out.println(magazine);
        }
        System.out.print("Select magazine by ID to delete: ");
        input.nextLine();
        String magazineID = input.nextLine();
        return magazineID;
    }

    public String novelDelete(){
        System.out.println("------------------------");
        System.out.println("Delete Magazine by ID");
        System.out.println("------------------------");
        for(Novel novel : novels.getNovels()){
            System.out.println(novel);
        }
        System.out.print("Select Novel by ID to delete: ");
        input.nextLine();
        String novelID = input.nextLine();
        return novelID;
    }
}
