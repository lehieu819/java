package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Level2 extends Tournament{
    private Tournament tournament;
    private Tournament leftBracket;
    private Tournament rightBracket;
    private ArrayList level3 = new ArrayList();

    public Level2 ( Tournament leftBracket, Tournament rightBracket){
        this.leftBracket = leftBracket;
        this.rightBracket = rightBracket;
        this.playerA = this.leftBracket.getWinner();
        this.playerB = this.rightBracket.getWinner();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Iterator it = level3.iterator(); it.hasNext();){
            ((Tournament) it.next()).accept(visitor);
        }

    }

    public void addLevel3 (Level3 level){
        level3.add(level);
    }
}