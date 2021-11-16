package com.company.drivetrain.fuelstorage;

public class Battery implements FuelStorage {

    // Methods
    @Override
    public void use() {
        System.out.println("Battery is now a bit emptier");
    }

    @Override
    public void fill() {
        System.out.println("Charging the battery...");
    }

    @Override
    public String toString() {
        return "Battery";
    }
}
