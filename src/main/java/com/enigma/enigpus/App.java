package com.enigma.enigpus;

import com.enigma.enigpus.model.Novel;
import com.enigma.enigpus.model.NovelController;
import com.enigma.enigpus.collection.dataCollection;

/**
 * Hello world!
 *
 */

import com.enigma.enigpus.view.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // NovelController novels = NovelController.getInstance();

        // try {
        //     File booksFile = new File("novel.txt");
        //     Scanner books = new Scanner(booksFile);

        //     while(books.hasNextLine()){
        //         String data = books.nextLine();
        //         System.out.println(data);
        //         Novel novel = Novel.fromString(data);
        //         novels.addNovel(novel);
        //     }
        //     books.close();

        // } catch (Exception e){
        //     System.out.println("Error: " + e.getMessage());
        // }
        UI ui = new UI();
        ui.menu();
    }
}
