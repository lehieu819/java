package com.company;

public class ConsertiumCard  extends  PaymentMethod{
    public ConsertiumCard(Player player) {
        super(player);
    }

    @Override
    void create(Booking booking) {
        System.out.println("create debt in consertium Card with " + booking);
    }

    @Override
    void pay(Booking booking) {
        System.out.println("Pay with Consetium Card");
    }

    @Override
    void refund(Booking booking) {
        System.out.println("Refund to Conertium Card");
    }
}
