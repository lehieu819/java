package com.company;

public class Main {

    public static void main(String[] args) {

        Booking booking = Booking.getInstance("Badminton");
        Booking booking1 = Booking.getInstance("Zumba");
        System.out.println(booking.value);
        System.out.println(booking1.value);

    }
}
