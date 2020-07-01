package com.company;

import java.time.LocalTime;

public class ZumbaClass extends Booking{

    public ZumbaClass(LocalTime startTime, LocalTime endTime, Player player) {
        super(startTime, endTime, player);
    }

    @Override
    void create() {
        System.out.println("create Zumba Booking");
    }

    @Override
    void cancel() {
        System.out.println("cancel Zumba Booking");
    }
}
