package com.company;

public class BadmintonCourt extends Court {

    public BadmintonCourt(){
        System.out.println("Badminton Court");
        this.type = "Badminton";
    }

    @Override
    public Court makeCopy() {
        System.out.println("Copy of Badminton Court");
        BadmintonCourt badmintonCourt = null;
        try {
            // Calls the Court super classes clone()
            // Then casts the results to BadmintonCourt

            badmintonCourt = (BadmintonCourt) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return badmintonCourt;
    }
}
