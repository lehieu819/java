package com.company;


import java.util.ArrayList;
import java.util.List;

public class Player extends Member{

    public Player(String name){
        super(name);
    }


    @Override
    public void update(int status) {
        this.status = status;
        System.out.println(
                name + " : Update Status : " + status);
        for (Manager man : managers) {
            man.updateStatus(status, this);
        }
    }
    @Override
    public void check(int status) {
        System.out.println(
                name +" : Receive Status : "+ status);
    }

    @Override
    public void setManager(Manager manager) {
        managers.add(manager);
    }
}