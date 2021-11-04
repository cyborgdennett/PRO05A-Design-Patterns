package com.example.VehicleTypes;

public abstract class Tank extends VehicleType {
    public Tank() {
    }

    @Override
    public String getType() {
        return "tank";
    }


    public void shoot(){
        System.out.println("Shooting!...");
    }
}
