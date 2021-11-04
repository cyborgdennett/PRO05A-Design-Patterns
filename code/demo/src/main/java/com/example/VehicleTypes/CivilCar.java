package com.example.VehicleTypes;

import com.example.Vehicles.Vehicle;

public abstract class CivilCar extends VehicleType {
    public CivilCar() {

    }
    public String getType(){
        return "civilcar";
    }

    @Override
    public abstract String getModel();

    public void park(){
        System.out.println("Parking!...");
    }
}
