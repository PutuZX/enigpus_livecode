package com.enigma.enigpus.collection;

import java.io.File;
import java.util.Scanner;

import com.enigma.enigpus.model.Magazine;
import com.enigma.enigpus.model.MagzController;
import com.enigma.enigpus.model.Novel;
import com.enigma.enigpus.model.NovelController;

public class dataCollection {
    public void readBookFile(){
        NovelController novels = NovelController.getInstance();
        MagzController magazines = MagzController.getInstance();
        novels.clearNovels();
        magazines.clearMagazines();

        try {
            File booksFile = new File("novel.txt");
            Scanner books = new Scanner(booksFile);

            while(books.hasNextLine()){
                String data = books.nextLine();
                if(data.charAt(5) == 'A'){
                    String data1 = data;
                    System.out.println(data1);
                    Novel novel = Novel.fromString(data);
                    novels.addNovel(novel);
                } else{
                    System.out.println("it's run!");
                    String data2 = data;
                    System.out.println(data2);
                    Magazine magazine = Magazine.fromString(data);
                    magazines.addMagazine(magazine);
                }
            }
            books.close();

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
