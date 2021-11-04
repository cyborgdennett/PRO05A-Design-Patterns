package com.example.Vehicles;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.VehicleTypes.Tank;

public class InfantryTank extends Tank {
    public InfantryTank(DriveTrain driveTrain) {
        super(driveTrain);
    }

    @Override
    public String getModel() {
        return "infantry";
    }
}
