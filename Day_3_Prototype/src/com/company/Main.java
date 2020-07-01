package com.company;

public class Main {

    public static void main(String[] args) {
        CloneFactory courtMaker = new CloneFactory();
        BadmintonCourt court1 = new BadmintonCourt();
        ZumbaCourt court2 = new ZumbaCourt();
        Court court3 = (BadmintonCourt) courtMaker.getClone(court1);
        court1.getType();
        court2.getType();
        court3.getType();
    }
}
