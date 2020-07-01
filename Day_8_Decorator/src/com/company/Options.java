package com.company;

public abstract class Options extends Booking{
    protected Booking optionsBooking;
    public Options(Booking booking){
        optionsBooking = booking;
    }
    public Booking getOptionsPrice(){
        return optionsBooking;
    }
    public void setOptionsPrice(){
        this.optionsBooking = optionsBooking;
    }
}
