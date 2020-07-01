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


         Level3 match1 = new Level3(player1, player2);
        Level3 match2 = new Level3(player3, player4);
        Level3 match3 = new Level3(player5, player6);
        Level3 match4 = new Level3(player7, player8);
        match1.setWinner(player1);
        match2.setWinner(player3);
        match3.setWinner(player5);
        match4.setWinner(player7);

        Level2 semifinal1 = new Level2(match1,match2);
        Level2 semifinal2 = new Level2(match3,match4);

        semifinal1.setWinner(player1);
        semifinal2.setWinner(player5);

        //Last game
        Level1 finalMatch = new Level1(semifinal1, semifinal2);
        finalMatch.setWinner(player1);

        match1.showGame();
        match2.showGame();
        match3.showGame();
        match4.showGame();
        semifinal1.showGame();
        semifinal2.showGame();
        finalMatch.showGame();


        TournamentLevel level = new TournamentLevel();
        finalMatch.accept(level);
        match2.accept(level);
    }
}
