
package com.company;

public class Main {

    public static void main(String[] args) {
        ZumbaClass zumbaClass1 = new ZumbaClass();
        ZumbaClass zumbaClass2 = new ZumbaClass();
        ZumbaClass zumbaClass3 = new ZumbaClass();


        Member coach1 = new Coach("Coach 1");
        Member coach2 = new Coach("Coach 2");
        Member coach3 = new Coach("Coach 3" );

        Member player1 = new Player("Player 1");
        Member player2 = new Player("Player 2");
        Member player3=  new Player( "Player 3");

        zumbaClass1.addMember(coach1);
        zumbaClass1.addMember(player1);
        zumbaClass1.addMember(player2);

        zumbaClass2.addMember(coach2);
        zumbaClass2.addMember(player1);

        zumbaClass3.addMember(coach3);
        zumbaClass3.addMember(player3);

        player1.update(1);
        player2.update(2);
        coach1.update(3);



    }
}