package com.company;

public class Badminton extends Booking{
    protected int price = 50;
    public int pay() {
        return price;
    }
    public String announce(){
        return "Badminton";
    }

}
