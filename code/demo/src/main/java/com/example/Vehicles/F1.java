package com.example.Vehicles;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.VehicleTypes.RaceCar;

public class F1 extends Vehicle implements RaceCar{
    public F1(DriveTrain driveTrain){
        super(driveTrain);
    }

    @Override
    public String getModel() {
        return "F1";
    }

    @Override
    public String getType() {
        return "RaceCar";
    }

    @Override
    public void drive() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void fill() {

    }

    @Override
    public String getName() {
        return "F1";
    }
}
