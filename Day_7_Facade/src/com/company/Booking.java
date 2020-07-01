package com.company;


import java.time.LocalTime;

public abstract class Booking {
    private LocalTime startTime;
    private LocalTime endTime;
    private Player player;

    public Booking(LocalTime startTime, LocalTime endTime, Player player) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.player = player;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public Player getPlayer() {
        return player;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void moveToNextWeek(){
        this.startTime.plusHours(7*24);
        this.endTime.plusHours(7*24);
    }

    public void extend(int minute){
        this.endTime.plusMinutes(minute);
    }

    abstract void create();
    abstract void cancel();

}
