package com.example.DriveFactory;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.Engines.Engine;
import com.example.Parts.Storage.FuelTank;

public class HydrogenDriveFactory implements DriveFactory {
    @Override
    public Engine makeEngine() {
        return null;
    }

    @Override
    public FuelTank makeFuelStorage() {
        return null;
    }

    @Override
    public DriveTrain driveTrain() {
        return null;
    }
}
