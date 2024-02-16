package com.enigma.enigpus.util;

import java.util.Scanner;

public class Validator {
    public int intValidator(Scanner input){
        if(input.hasNextInt()){
            return input.nextInt();
        } else{
            return 0;
        }
    }
}
