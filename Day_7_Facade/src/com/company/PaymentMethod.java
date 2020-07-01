package com.company;


public abstract class PaymentMethod {
    private Player player;

    public PaymentMethod(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    abstract void create(Booking booking);
    abstract void pay(Booking booking);
    abstract void refund(Booking booking);

}
