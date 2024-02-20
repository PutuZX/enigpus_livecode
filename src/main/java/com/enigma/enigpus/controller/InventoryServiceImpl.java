package com.enigma.enigpus.controller;

import java.io.FileWriter;
import java.io.IOException;

import com.enigma.enigpus.model.Magazine;
import com.enigma.enigpus.model.MagzController;
import com.enigma.enigpus.model.Novel;
import com.enigma.enigpus.model.NovelController;
import com.enigma.enigpus.view.UI;

public class InventoryServiceImpl implements InventoryService {
    UI ui = new UI();
    NovelController novels = NovelController.getInstance();
    MagzController magazines = MagzController.getInstance();
    public void serviceController(int input){
        switch (input) {
            case 1:
                addBook(ui.bookTypeUI());
                ui.menu();
                break;
            case 2:
                searchBookByTitle(ui.bookTypeUI());
                ui.menu();
                break;
            case 3:
                searchBookById(ui.bookTypeUI());
                ui.menu();
                break;
            case 4:
                deleteBook(ui.bookTypeUI());
                ui.menu();
                break;
            case 5:
                getAllBook(ui.bookTypeUI());
                ui.menu();
                break;
            default:
                ui.quitUI();
                break;
        }
    }

    @Override
    public void addBook(int bookChoice){
        if(bookChoice == 1){
            ui.addNovel();
        } else{
            ui.addMagazine();
        }
        try (FileWriter writer = new FileWriter("novel.txt")){
            for(Novel novel : novels.getNovels()){
                writer.write(novel + System.lineSeparator());
            }
            for(Magazine magazine : magazines.getMagazines()){
                writer.write(magazine + System.lineSeparator());
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void searchBookByTitle(int bookChoice){
        boolean found = false;
        if(bookChoice == 1){
            String novelTitle = ui.novelTitleUI();
            for(Novel novel : novels.getNovels()){
                if(novelTitle.equals(novel.getTitle())){
                    System.out.println(novel);
                    found = true;
                }
            }
        } else{
            String magzTitle = ui.magzTitleUI();
            for(Magazine magazine : magazines.getMagazines()){
                if(magzTitle.equals(magazine.getTitle())){
                    System.out.println(magazine);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("Not found!");
        }
    }

    @Override
    public void searchBookById(int bookChoice){
        boolean found = false;
        if(bookChoice == 1){
            String novelID = ui.novelIDUI();
            for(Novel novel : novels.getNovels()){
                if(novelID.equals(novel.getBookId())){
                    System.out.println(novel);
                    found = true;
                }
            }
        } else{
            String magzID = ui.magzIDUI();
            for(Magazine magazine : magazines.getMagazines()){
                if(magzID.equals(magazine.getBookId())){
                    System.out.println(magazine);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("Not found!");
        }
    }

    @Override
    public void deleteBook(int bookChoice){
        boolean found = false;
        if(bookChoice == 1){
            String novelID = ui.novelDelete();
            for(Novel novel : novels.getNovels()){
                if(novelID.equals(novel.getBookId())){
                    System.out.println(novel);
                    novels.removeNovel(novel);
                    found = true;
                }
            }
        } else{
            String magzID = ui.magzDelete();
            for(Magazine magazine : magazines.getMagazines()){
                if(magzID.equals(magazine.getBookId())){
                    System.out.println(magazine);
                    magazines.removeMagazine(magazine);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("Not found!");
        }

        try (FileWriter writer = new FileWriter("novel.txt")){
            for(Novel novel : novels.getNovels()){
                writer.write(novel + System.lineSeparator());
            }
            for(Magazine magazine : magazines.getMagazines()){
                writer.write(magazine + System.lineSeparator());
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
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
