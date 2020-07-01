package com.company;

public abstract class Person {
    protected String name;
    protected BadmintonClass badmintonClass;

    public void setBadmintonClass(BadmintonClass badmintonClass) {
        this.badmintonClass = badmintonClass;
    }
}