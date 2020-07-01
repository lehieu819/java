package com.company;

public class ShowerOption extends Options {
    protected int shower = 20;
    public ShowerOption(Booking booking) {
        super(booking);
    }
    public int pay(){
        int pay = optionsBooking.pay();
        return pay + shower;
    }
    public String announce(){
        String announce = optionsBooking.announce();
        return announce + " + Shower";
    }
}