package com.example.DriveFactory;

import com.example.Fuels.Gas;
import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.Engines.Engine;
import com.example.Parts.Engines.FuelEngine;
import com.example.Parts.Storage.FuelStorage;
import com.example.Parts.Storage.FuelTank;
import com.example.Parts.Storage.GasTank;

public class HydrogenDriveFactory implements DriveFactory {
    @Override
    public Engine makeEngine(int hp) {
        return new FuelEngine(new Gas(), hp);
    }

    @Override
    public FuelStorage makeFuelStorage(float maxCapacity) {
        return new GasTank(new Gas(), maxCapacity);
    }
}
