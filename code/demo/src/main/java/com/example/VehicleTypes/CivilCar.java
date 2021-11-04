package com.example.VehicleTypes;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Vehicles.Vehicle;

public abstract class CivilCar extends Vehicle {
    public CivilCar(DriveTrain driveTrain) {
        super(driveTrain);

    }
    public String getType(){
        return "civilcar";
    }

    public void park(){
        System.out.println("Parking!...");
    }
}
