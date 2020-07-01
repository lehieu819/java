package com.company;

public class BookingManager {
    // https://kipalog.com/posts/Design-Patern----Facade-Patern
    private Booking booking;
    private PaymentMethod paymentMethod;
    public BookingManager(Booking booking, PaymentMethod paymentMethod) {
        this.booking = booking;
        this.paymentMethod = paymentMethod;
    }

    public void create() {
            paymentMethod.create(booking);
            booking.create();
    }

    public void cancel(){
            paymentMethod.refund(booking);
            booking.cancel();
    }

    public void pay(){
        paymentMethod.pay(booking);
    }

    public void moveToNextWeek(Booking booking){
        paymentMethod.refund(booking);
        booking.moveToNextWeek();
        paymentMethod.pay(booking);
    }

    public void transferOwnerShip(PaymentMethod newPaymentMethod){
        paymentMethod.refund(booking);
        this.paymentMethod = newPaymentMethod;
        booking.setPlayer(newPaymentMethod.getPlayer());
        newPaymentMethod.pay(booking);
    }

    public void extend(Booking booking, int minute){
        paymentMethod.refund(booking);
        booking.extend(minute);
        paymentMethod.pay(booking);
    }
}
