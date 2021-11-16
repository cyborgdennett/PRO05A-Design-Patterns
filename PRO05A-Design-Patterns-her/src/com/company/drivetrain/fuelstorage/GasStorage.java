package com.company.drivetrain.fuelstorage;

public class GasStorage implements FuelStorage {

    // Methods
    public void use() {
        System.out.println("The gas tank is now a bit emptier");
    }

    public void fill() {
        System.out.println("Filling the gas tank...");
    }

    @Override
    public String toString() {
        return "GasStorage";
    }

    public int price(){
        return 500;
    }
}
