package com.company;

public class Coach extends Member{

    public Coach(String name){
        super(name);
    }
    @Override

    public void update(int status) {
        this.status  = status;
        System.out.println(
                name +" : Update Status : "+ status);
        manager.updateStatus(status,this);
    }

    @Override
    public void check(int status) {
        System.out.println(
                name +" : Receive Status : "+ status);
    }

    @Override
    public void setManager(Manager manager) {
        this.manager = manager;
    }
}