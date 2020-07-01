package com.company;

public class DebidCard extends PaymentMethod {
    public DebidCard(Player player) {
        super(player);
    }

    @Override
    void create(Booking booking) {
        System.out.println("create debt in debit Card with Booking ");
    }

    @Override
    void pay(Booking booking) {
        System.out.println("Pay with debit Card");
    }

    @Override
    void refund(Booking booking) {
        System.out.println("Refund to debit Card");
    }
}

