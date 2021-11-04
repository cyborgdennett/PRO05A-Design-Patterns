package com.example.DriveFactory;

import com.example.Fuels.Petrol;
import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.Engines.Engine;
import com.example.Parts.Storage.FuelTank;

public class PetrolDriveFactory implements DriveFactory{
    @Override
    public Engine makeEngine() {
        return null;
    }

    @Override
    public FuelTank makeFuelStorage(float maxCapacity) {
        return new FuelTank(new Petrol(), maxCapacity);
    }

    @Override
    public DriveTrain driveTrain() {
        return null;
    }
}
