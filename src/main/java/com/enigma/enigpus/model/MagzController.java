package com.enigma.enigpus.model;

import java.util.ArrayList;
import java.util.List;
import com.enigma.enigpus.model.Magazine;

public class MagzController {
    private static MagzController instance;
    private ArrayList<Magazine> magazines;

    public MagzController(){
        this.magazines = new ArrayList<>();
    }

    public static MagzController getInstance(){
        if(instance == null){
            instance = new MagzController();
        }
        return instance;
    }

    public void addMagazine(Magazine magazine){
        magazines.add(magazine);
    }

    public Magazine getMagazine(int index){
        return magazines.get(index);
    }

    public void removeMagazine(Magazine magazine){
        magazines.remove(magazine);
    }

    public int getTotalMagazine(){
        return magazines.size();
    }

    public void clearMagazines() {
        magazines.clear();
    }

    public List<Magazine> getMagazines(){
        return new ArrayList<>(magazines);
    }
}
