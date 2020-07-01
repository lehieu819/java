package com.company;

public class ZumbaCourt extends Court {


    public ZumbaCourt() {
        System.out.println("Zumba Court");
        this.type = "Zumba";
    }

    @Override
    public Court makeCopy() {
        System.out.println("Copy of Zumba Court");
        ZumbaCourt zumbaCourt = null;
        try {
            // Calls the Court super classes clone()
            // Then casts the results to BadmintonCourt

            zumbaCourt = (ZumbaCourt) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return zumbaCourt;
    }
}
