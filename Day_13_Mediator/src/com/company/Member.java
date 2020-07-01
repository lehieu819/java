package com.company;

public abstract class Member {
    protected Manager manager;
    protected int status;
    protected String name;

    public Member(String name){
        this.name = name;
    }
    public abstract void update(int status);

    public abstract void check(int status);
    public abstract void setManager(Manager manager);
}