package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Level1 extends Tournament {
    private Tournament tournament;
    private Tournament leftBracket;
    private Tournament rightBracket;
    private ArrayList level2 = new ArrayList();

    public Level1 (Tournament leftBracket, Tournament rightBracket){
        this.leftBracket = leftBracket;
        this.rightBracket = rightBracket;
        this.playerA = this.leftBracket.getWinner();
        this.playerB = this.rightBracket.getWinner();
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Iterator it = level2.iterator(); it.hasNext();){
            ((Tournament) it.next()).accept(visitor);
        }

    }

    public void addLevel2( Level2 level){
        level2.add(level);
    }
}
