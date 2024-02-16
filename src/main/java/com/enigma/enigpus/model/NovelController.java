package com.enigma.enigpus.model;

import java.util.ArrayList;
import java.util.List;

import com.enigma.enigpus.model.Novel;

public class NovelController {
    private static NovelController instance;
    private ArrayList<Novel> novels;

    private NovelController(){
        this.novels = new ArrayList<>();
    }

    public static NovelController getInstance(){
        if(instance == null){
            instance = new NovelController();
        }
        return instance;
    }

    public void addNovel(Novel novel){
        novels.add(novel);
    }

    public Novel getNovel(int index){
        return novels.get(index);
    }

    public void removeNovel(Novel novel){
        novels.remove(novel);
    }

    public int getTotalNovel(){
        return novels.size();
    }

    public void clearNovels() {
        novels.clear();
    }

    public List<Novel> getNovels() {
        return new ArrayList<>(novels);
    }
}
