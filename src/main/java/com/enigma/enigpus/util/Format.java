package com.enigma.enigpus.util;

import com.enigma.enigpus.model.MagzController;
import com.enigma.enigpus.model.NovelController;

public class Format {
    MagzController magazines = MagzController.getInstance();
    NovelController novels = NovelController.getInstance();
    public String bookFormatting(int choice, String year){
        String idFormat = "";
        if(choice == 1){
            int idNum1 = novels.getTotalNovel() + 1;
            return idFormat = year + "-A-" + idNum1;
        } else{
            int idNum2 = magazines.getTotalMagazine() + 1;
            return idFormat = year + "-B-" + idNum2;
        }
    }
}
