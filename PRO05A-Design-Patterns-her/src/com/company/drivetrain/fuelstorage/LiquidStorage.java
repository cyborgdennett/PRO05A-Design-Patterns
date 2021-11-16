package com.company.drivetrain.fuelstorage;

public class LiquidStorage implements FuelStorage {

    // Methods
    @Override
    public void use() {
        System.out.println("The fuel storage is now a bit emptier");
    }

    @Override
    public void fill() {
        System.out.println("Filling the fuel storage...");
    }

    @Override
    public String toString() {
        return "LiquidStorage";
    }
}
