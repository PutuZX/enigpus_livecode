package com.enigma.enigpus.controller;

import com.enigma.enigpus.model.*;
import com.enigma.enigpus.view.UI;
import java.io.FileWriter;
import java.io.IOException;

public class InventoryServiceImpl implements InventoryService {
    UI ui = new UI();
    NovelController novels = NovelController.getInstance();
    MagzController magazines = MagzController.getInstance();
    public void serviceController(int input){
        switch (input) {
            case 1:
                addBook(ui.bookTypeUI());
                break;
            case 5:
                getAllBook(ui.bookTypeUI());
                break;
            // case 2:
            //     ui.updateProductUI();
            //     break;
            // case 3:
            //     ui.removeProductUI();
            //     break;
            // case 4:
            //     ui.viewProductUI();
            //     break;
            // case 5:
            //     ui.findProductUI();
            //     break;
            // case 6:
            //     System.out.println(ui.getQuit());
            //     break;
            // default:
            //     System.out.println(ui.getInvalidService());
            //     break;
        }
    }

    @Override
    public void addBook(int bookChoice){
        if(bookChoice == 1){
            ui.addNovel();
            System.out.println("magazine aded");
        } else{
            ui.addMagazine();
            System.out.println("magazine addded");
        }
        try (FileWriter writer = new FileWriter("novel.txt")){
            System.out.println(novels.getNovels());
            System.out.println(magazines.getMagazines());
            for(Novel novel : novels.getNovels()){
                System.out.println("Novel added");
                writer.write(novel + System.lineSeparator());
            }
            for(Magazine magazine : magazines.getMagazines()){
                System.out.println("magazine added");
                writer.write(magazine + System.lineSeparator());
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void searchBookByTitle(){

    }

    @Override
    public void searchBookById(){

    }

    @Override
    public void deleteBook(){

    }

    @Override
    public void getAllBook(int bookChoice){
        if(bookChoice == 1){
            ui.displayNovel();
        } else{
            ui.displayMagazine();
        }
    }
}
