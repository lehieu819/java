package com.company;

public class Main {


    public static void main(String[] args) {
        BadmintonClass badmintonClass = new BadmintonClass();

        Player player = new Player("Hieu");
        Manager manager = new Manager("Trung");

        Court court1 = new Court("Court 1");
        Court court2 = new Court("Court 2");
        Court court3 = new Court("Court 3");

        player.setBadmintonClass(badmintonClass);
        manager.setBadmintonClass(badmintonClass);

        manager.addC(court1);
        manager.addC(court2);
        manager.addC(court3);
        badmintonClass.checkCourtAvailable();

        player.bank();
        badmintonClass.checkCourtAvailable();


    }
}
