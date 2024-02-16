package com.enigma.enigpus.view;

import java.util.Scanner;

public class UI {
    Scanner input = new Scanner(System.in);
    public void menu(){
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
        System.out.println(inputValue);
    }

    public void addBookUI(){
        System.out.println("------------------------");
        System.out.println("Adding Book Page");
        System.out.println("------------------------");
        System.out.println();
    }
}
