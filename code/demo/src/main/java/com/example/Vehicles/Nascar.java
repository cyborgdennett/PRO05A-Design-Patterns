package com.example.Vehicles;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.VehicleTypes.RaceCar;

public class Nascar extends RaceCar {
    public Nascar(DriveTrain driveTrain) {
        super(driveTrain);
    }

    @Override
    public String getModel() {
        return "Nascar";
    }
}
