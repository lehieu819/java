package com.company;



public class Player extends Person {
    public Player(String name){
        this.name = name;
    }
    public void pay(Court court){
        System.out.print( name + " Pay ");
        court.check(court);
    }

}