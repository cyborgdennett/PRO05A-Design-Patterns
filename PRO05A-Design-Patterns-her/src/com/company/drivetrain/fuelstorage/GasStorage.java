package com.company.drivetrain.fuelstorage;

public class GasStorage implements FuelStorage {

    // Methods
    @Override
    public void use() {
        System.out.println("The gas tank is now a bit emptier");
    }

    @Override
    public void fill() {
        System.out.println("Filling the gas tank...");
    }

    @Override
    public String toString() {
        return "GasStorage";
    }
}
