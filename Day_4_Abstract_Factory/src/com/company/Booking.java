package com.company;

public abstract class Booking {
    protected int price;
    protected String type;
    public void getType(){
        System.out.println(type);
    }
    public void getPrice(){
        System.out.println(price);
    }
}
