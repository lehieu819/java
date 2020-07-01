package com.company;

public class Court {
    protected String name;
    protected int status = 0;
    public Court(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println(this.name);
    }
    public void setStatus(int status){
        this.status = status;
    }
    public int getStatus(){
        return status;
    }
}