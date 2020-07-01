
package com.company;

public class ParkingOption extends Options {
    protected int parking = 15;
    public ParkingOption(Booking booking) {
        super(booking);
    }
    public int pay(){
        int pay = optionsBooking.pay();
        return pay + parking;
    }
    public String announce(){
        String announce = optionsBooking.announce();
        return announce + " + Parking";
    }
}