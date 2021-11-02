package com.example.Parts.DriveTrain;

import com.example.Parts.Engines.ElectricEngine;
import com.example.Parts.Engines.Engine;
import com.example.Parts.Storage.Battery;
import com.example.Parts.Storage.FuelTank;

public class HybridDriveTrain implements DriveTrain{
    private ElectricDriveTrain electricDriveTrain;
    private FuelDriveTrain fuelDriveTrain;
    @Override
    public void drive() {
        electricDriveTrain.drive();
        fuelDriveTrain.drive();
    }
}
