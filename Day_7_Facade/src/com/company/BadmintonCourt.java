package com.company;

import java.time.LocalTime;

public class BadmintonCourt extends Booking{

    public BadmintonCourt(LocalTime startTime, LocalTime endTime, Player player) {
        super(startTime, endTime, player);
    }

    @Override
    void create() {
        System.out.println("create Badminton Court Booking");
    }

    @Override
    void cancel() {
        System.out.println("cancel Badminton Court Booking");
    }
}
