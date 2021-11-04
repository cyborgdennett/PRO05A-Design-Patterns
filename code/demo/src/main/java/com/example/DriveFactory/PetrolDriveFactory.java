package com.example.DriveFactory;

import com.example.Fuels.Petrol;
import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.DriveTrain.FuelDriveTrain;
import com.example.Parts.Engines.Engine;
import com.example.Parts.Engines.FuelEngine;
import com.example.Parts.Storage.FuelStorage;
import com.example.Parts.Storage.FuelTank;

public class PetrolDriveFactory implements DriveFactory{
    @Override
    public FuelEngine makeEngine(int hp) {
        return new FuelEngine(new Petrol(), hp);
    }

    @Override
    public FuelTank makeFuelStorage(float maxCapacity) {
        return new FuelTank(new Petrol(), maxCapacity);
    }
    public FuelDriveTrain makeDriveTrain(FuelEngine engine, FuelTank fuelTank){
        return new FuelDriveTrain(engine, fuelTank);
    }
}
