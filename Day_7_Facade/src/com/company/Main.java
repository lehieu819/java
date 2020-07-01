package com.company;

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("player1");
        PaymentMethod paymentMethodPlayer1 = new DebidCard(player1);
        Booking booking = new BadmintonCourt(LocalTime.of(9,0), LocalTime.of(10,0), player1);

        BookingManager player1Manager = new BookingManager(booking, paymentMethodPlayer1);
        player1Manager.create();
        player1Manager.pay();

    }
}
