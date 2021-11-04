package com.example.Vehicles;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.VehicleTypes.RaceCar;

public class F1 extends RaceCar {
    public F1(DriveTrain driveTrain){
        super(driveTrain);
    }
    @Override
    public String getModel() {
        return "F1";
    }
}
