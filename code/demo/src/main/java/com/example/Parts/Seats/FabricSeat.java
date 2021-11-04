package com.example.Parts.Seats;

public class FabricSeat implements Seat {

    @Override
    public void print() {
        System.out.println("FabricSeat");
    }

    @Override
    public String getName() {
        return "FabricSeat";
    }
}
