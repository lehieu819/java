package com.company;

public class SinglesBadmintonTournament extends Tournament {
    private Tournament leftBracket;
    private Tournament rightBracket;
    public SinglesBadmintonTournament(Tournament leftBracket, Tournament rightBracket) {
        this.status = 1;
        this.leftBracket = leftBracket;
        this.rightBracket = rightBracket;
        this.playerA = this.leftBracket.getWinner();
        this.playerB = this.rightBracket.getWinner();
    }
    public Tournament getLeftBracket(){
        return leftBracket;
    }

    public Tournament getRightBracket(){
        return rightBracket;
    }
}