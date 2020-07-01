package com.company;

public class LockerOption extends Options{
    protected int locker = 10;
    public LockerOption(Booking booking) {
        super(booking);
    }
    public int pay(){
        int pay = optionsBooking.pay();
        return pay + locker;
    }
    public String announce(){
        String announce = optionsBooking.announce();
        return announce + " + Locker";
    }
}