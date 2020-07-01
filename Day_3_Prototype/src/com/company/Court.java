package com.company;

public abstract class Court implements Cloneable {
    public String type;
    public abstract Court makeCopy();
    public void getType(){
        System.out.println(type);
    }
}
