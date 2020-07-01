package com.company;

import java.util.ArrayList;
import java.util.List;

public class BadmintonClass {

    private List<Court> courtList = new ArrayList<>();

    public void addCourt(Court court){
        courtList.add(court);
    }

    public void bookCourt(){
        for ( Court court : courtList){
            if (court.getStatus() == 0){
                court.getName();
                court.setStatus(1);
                break;
            }
        }

    }


    public void checkCourtAvailable(){
        System.out.println("Courts are still available: ");
        for ( Court court : courtList){
            if (court.getStatus() == 0){
                court.getName();
            }
        }
    }
}