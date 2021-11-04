package com.example.VehicleTypes;

public abstract class RaceCar extends VehicleType {


    public RaceCar(){

    }

    @Override
    public String getType() {
        return "racecar";
    }

    @Override
    public abstract String getModel();

    public void overtake(){
        System.out.println("Overtaking!...");
    }
}
