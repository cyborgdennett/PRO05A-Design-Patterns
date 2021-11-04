package com.example.VehicleTypes;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Vehicles.Vehicle;

public abstract class RaceCar extends Vehicle {


    public RaceCar(DriveTrain driveTrain){
        super(driveTrain);

    }

    @Override
    public String getType() {
        return "RaceCar";
    }

    public void overtake(){
        System.out.println("Overtaking!...");
    }
}
