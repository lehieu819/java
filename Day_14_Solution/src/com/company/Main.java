package com.company;

public class Main {


    public static void main(String[] args) {


        Player player = new Player("Hieu");


        Court court1 = new Court("Court 1");
        Court court2 = new Court("Court 2");
        Court court3 = new Court("Court 3");
        Court court4 = new Court("Court 4");

        court1.setStatus(1);
        court2.setStatus(1);


        court1.setNextChain(court2);
        court2.setNextChain(court3);
        court3.setNextChain(court4);


        player.pay(court1);

    }
}
