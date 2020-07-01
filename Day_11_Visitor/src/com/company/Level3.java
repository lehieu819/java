package com.company;


public class Level3 extends Tournament {
    private Tournament tournament;

    public Level3 ( Player player1, Player player2){
        this.playerA = player1;
        this.playerB = player2;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        tournament.showGame();

    }
}