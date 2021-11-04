package com.example.DriveFactory;

import com.example.Fuels.Diesel;
import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.Engines.Engine;
import com.example.Parts.Storage.FuelTank;

public class DieselDriveFactory implements DriveFactory{
    @Override
    public Engine makeEngine() {
        return null;
    }

    @Override
    public FuelTank makeFuelStorage(float maxCapacity) {
        return new FuelTank(new Diesel(), maxCapacity);
    }

    @Override
    public DriveTrain driveTrain() {
        return null;
    }
}
