package com.company;

public class Main {

    public static void main(String[] args) {
        BD001Factory factory = new BD001Factory();
        Booking court = factory.createBadmintonCourt();
        court.getPrice();
        court.getType();

    }
}
