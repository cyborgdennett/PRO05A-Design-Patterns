package com.example.Vehicles;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.VehicleTypes.CivilCar;
import com.example.VehicleTypes.VehicleType;

public class SedanCar extends Vehicle implements CivilCar {

    public SedanCar(DriveTrain driveTrain) {
        super(driveTrain);
    }

    @Override
    public String getModel() {
        return "SedanCar";
    }

    @Override
    public String getType() {
        return "CivilCar";
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
        return null;
    }
}