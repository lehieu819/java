package com.company;

public abstract class BookingAbstractFactory
{
    private static final BD001Factory bd001 = new BD001Factory();
    private static final BD002Factory bd002 = new BD002Factory();

    static BookingAbstractFactory getFactory(String sport) {
        BookingAbstractFactory factory = null;
        switch (sport) {
            case "BD001":
                factory = bd001;
                break;
            case "BD002":
                factory = bd002;
                break;
        }
        return factory;
    }

    public abstract ZumbaClass createZumbaClass();
    public abstract BadmintonCourt createBadmintonCourt();

}