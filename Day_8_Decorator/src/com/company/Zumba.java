package com.company;

public class Zumba extends Booking {
    protected  int price = 100;

    public int pay() {
        return price;
    }
    public String announce(){
        return "Zumba";
    }
}