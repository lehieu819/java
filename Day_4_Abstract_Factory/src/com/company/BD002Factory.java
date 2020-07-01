package com.company;

public class BD002Factory extends BookingAbstractFactory {
    @Override
    public ZumbaClass createZumbaClass() {
        ZumbaClass zumbaclass = new BD002ZumbaClass();
        return zumbaclass;
    }

    @Override
    public BadmintonCourt createBadmintonCourt() {
        BadmintonCourt badmintoncourt = new BD002BadmintonCourt();
        return badmintoncourt;
    }
}
