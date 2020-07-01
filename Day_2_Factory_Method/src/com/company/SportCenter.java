package com.company;

public class SportCenter {
    public SportCenter() {

    }
    public Court getCourt(String type){
        switch(type) {
                case"Badminton":
                    return new BadmintonCourt();
                case"Zumba":
                    return new ZumbaCourt();
            default:
                        return null;
        }
    }

}
