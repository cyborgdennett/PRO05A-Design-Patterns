package com.example.Parts.Seats;

public class LeatherSeat implements Seat {

    @Override
    public void print() {
        System.out.println("LeatherSeat");
    }

    @Override
    public String getName() {
        return "LeatherSeat";
    }
}
