package com.example.Vehicles;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.VehicleTypes.Tank;
import com.example.VehicleTypes.VehicleType;

public class InfantryTank extends Vehicle implements Tank  {
    public InfantryTank(DriveTrain driveTrain){
        super(driveTrain);
    }

    @Override
    public String getModel() {
        return "Infanrty";
    }

    @Override
    public String getType() {
        return "Tank";
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
        return "infantry";
    }
}
