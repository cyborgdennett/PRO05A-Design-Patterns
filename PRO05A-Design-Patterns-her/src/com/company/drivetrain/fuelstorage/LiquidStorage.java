package com.company.drivetrain.fuelstorage;

public class LiquidStorage implements FuelStorage {

    // Methods
    public void use() {
        System.out.println("The fuel tank is now a bit emptier");
    }

    public void fill() {
        System.out.println("Filling the fuel storage...");
    }

    @Override
    public String toString() {
        return "LiquidStorage";
    }

    public int price(){
        return 80;
    }
}
