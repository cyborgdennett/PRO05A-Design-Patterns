package com.example.Vehicles;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.VehicleTypes.CivilCar;

public class SUVCar extends Vehicle implements CivilCar {

    public SUVCar(DriveTrain driveTrain) {
        super(driveTrain);
    }

    @Override
    public String getModel() {
        return "SUV";
    }

    @Override
    public String getType() {
        return "CivilCar";
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