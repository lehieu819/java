package com.company;

public class BD001Factory extends BookingAbstractFactory {
    @Override
    public ZumbaClass createZumbaClass() {
        ZumbaClass zumbaclass = new BD001ZumbaClass();
        return zumbaclass;
    }

    @Override
    public BadmintonCourt createBadmintonCourt() {
        BadmintonCourt badmintoncourt = new BD001BadmintonCourt();
        return badmintoncourt;
    }
}
