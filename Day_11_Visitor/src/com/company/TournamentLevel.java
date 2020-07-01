package com.company;

public class TournamentLevel implements Visitor{

    @Override




    public void visit(Level1 level1) {
        System.out.println("Level 1 ");
        level1.showGame();
    }

    @Override

    public void visit(Level2 level2) {
        System.out.println("Level 2 ");
        level2.showGame();

    }
    @Override
    public void visit(Level3 level3) {
        System.out.println("Level 3 ");
        level3.showGame();

    }
}