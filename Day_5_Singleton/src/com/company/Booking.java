package com.company;

public class Booking {
        private static Booking instance;
        public String value;


    private Booking(String value) {
            this.value = value;
        }

    public static Booking getInstance(String value) {
        if (instance == null) {
            instance = new Booking(value);
        }
        return instance;
    }
}

