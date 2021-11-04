package com.example.Vehicles;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.VehicleTypes.RaceCar;
import com.example.VehicleTypes.VehicleType;

public class Nascar extends Vehicle {
    public Nascar(DriveTrain driveTrain){
        super(driveTrain);
    }

    public String getModel() {
        return "Nascar";
    }

    @Override
    public String getType() {
        return "RaceCar";
    }

    @Override
    public void drive() {

    }
}
