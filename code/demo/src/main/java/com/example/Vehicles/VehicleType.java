package com.example.Vehicles;

public abstract class VehicleType {
    protected int horsePower;
    protected int nrOfDoors;
    protected int nrOfSeats;

    public abstract String getType();
    public void print(){
        System.out.print("\t" + getHorsePower() + " hp.");
        System.out.print("\t" + getNrOfSeats() + " seats.");
        System.out.println("\t" + getNrOfDoors() + " doors.");
    };

    public int getHorsePower() {
        return horsePower;
    }

    public abstract void setHorsePower(int horsePower);

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
