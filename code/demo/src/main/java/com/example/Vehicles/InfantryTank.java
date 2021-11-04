package com.example.Vehicles;

import com.example.VehicleTypes.Tank;
import com.example.VehicleTypes.VehicleType;

public class InfantryTank extends Tank {
    public InfantryTank() {
    }

    @Override
    public String getModel() {
        return "tank";
    }
}
