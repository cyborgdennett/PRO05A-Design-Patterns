package com.example.DriveFactory;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.Engines.Engine;
import com.example.Parts.Storage.Battery;
import com.example.Parts.Storage.FuelTank;

public class ElectricDriveFactory implements DriveFactory{
    @Override
    public Engine makeEngine() {
        return null;
    }

    @Override
    public FuelTank makeFuelStorage(float maxCapacity) {
        return new Battery(maxCapacity);
    }

    @Override
    public DriveTrain driveTrain() {
        return null;
    }
}
