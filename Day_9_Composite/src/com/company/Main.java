package com.company;

public class Main {

    public static void main(String[] args) {
        //Generate 8 players
        Player player1 = new Player("1");
        Player player2 = new Player("2");
        Player player3 = new Player("3");
        Player player4 = new Player("4");
        Player player5 = new Player("5");
        Player player6 = new Player("6");
        Player player7 = new Player("7");
        Player player8 = new Player("8");


        Tournament match1 = new SinglesBadminton(player1, player2);
        Tournament match2 = new SinglesBadminton(player3, player4);
        Tournament match3 = new SinglesBadminton(player5, player6);
        Tournament match4 = new SinglesBadminton(player7, player8);
        match1.setWinner(player1);
        match2.setWinner(player3);
        match3.setWinner(player5);
        match4.setWinner(player7);

        Tournament semifinal1 = new SinglesBadmintonTournament(match1,match2);
        Tournament semifinal2 = new SinglesBadmintonTournament(match3,match4);

        semifinal1.setWinner(player1);
        semifinal2.setWinner(player5);

        //Last game
        Tournament finalMatch = new SinglesBadmintonTournament(semifinal1, semifinal2);
        finalMatch.setWinner(player1);

        match1.showGame();
        match2.showGame();
        match3.showGame();
        match4.showGame();
        semifinal1.showGame();
        semifinal2.showGame();
        finalMatch.showGame();


    }
}
