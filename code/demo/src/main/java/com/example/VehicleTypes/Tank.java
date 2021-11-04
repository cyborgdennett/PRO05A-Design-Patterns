package com.example.VehicleTypes;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Vehicles.Vehicle;

public abstract class Tank extends Vehicle {
    public Tank(DriveTrain driveTrain) {
        super(driveTrain);
    }

    @Override
    public String getType() {
        return "tank";
    }


    public void shoot(){
        System.out.println("Shooting!...");
    }
}
