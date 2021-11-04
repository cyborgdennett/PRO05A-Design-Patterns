package com.example.VehicleTypes;

import com.example.Vehicles.Vehicle;

public abstract class VehicleType extends Vehicle {
    protected int nrOfDoors;
    protected int nrOfSeats;

    public VehicleType() {
    }

    public abstract String getType();
    public abstract String getModel();
    public void print(){
        System.out.print("\t" + getNrOfSeats() + " seats.");
        System.out.println("\t" + getNrOfDoors() + " doors.");
    }
    public int getNrOfDoors() {
        return nrOfDoors;
    }

    public void setNrOfDoors(int nrOfDoors) {
        this.nrOfDoors = nrOfDoors;
    }

    public int getNrOfSeats() {
        return nrOfSeats;
    }

    public void setNrOfSeats(int nrOfSeats) {
        this.nrOfSeats = nrOfSeats;
    }
}
