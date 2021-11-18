package com.company.drivetrain.fuelstorage;

public class Battery implements FuelStorage {

    // Methods
    public void use() {
        System.out.println("Battery is now a bit emptier");
    }

    public void fill() {
        System.out.println("Charging the battery...");
    }

    @Override
    public String toString() {
        return "Battery";
    }

    public int price(){
        return 600;
    }
}
