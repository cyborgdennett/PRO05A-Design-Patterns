package com.example.DriveFactory;

import com.example.Fuels.Petrol;
import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.Engines.Engine;
import com.example.Parts.Engines.FuelEngine;
import com.example.Parts.Storage.FuelStorage;
import com.example.Parts.Storage.FuelTank;

public class PetrolDriveFactory implements DriveFactory{
    @Override
    public Engine makeEngine(int hp) {
        return new FuelEngine(new Petrol(), hp);
    }

    @Override
    public FuelStorage makeFuelStorage(float maxCapacity) {
        return new FuelTank(new Petrol(), maxCapacity);
    }
}
