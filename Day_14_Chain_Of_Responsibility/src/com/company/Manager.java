package com.company;

public class Manager extends Person {
    public Manager(String name){
        this.name = name;
    }
    public void addC(Court court){
        System.out.print(name+ " Add ");
        court.getName();
        this.badmintonClass.addCourt(court);
    }


}