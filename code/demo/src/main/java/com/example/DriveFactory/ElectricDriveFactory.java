package com.example.DriveFactory;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.Engines.ElectricEngine;
import com.example.Parts.Engines.Engine;
import com.example.Parts.Storage.Battery;
import com.example.Parts.Storage.FuelStorage;
import com.example.Parts.Storage.FuelTank;

public class ElectricDriveFactory implements DriveFactory{

    @Override
    public Engine makeEngine(int hp) {
        return new ElectricEngine(hp);
    }

    @Override
    public FuelStorage makeFuelStorage(float maxCapacity) {
        return new Battery(maxCapacity);
    }
}
