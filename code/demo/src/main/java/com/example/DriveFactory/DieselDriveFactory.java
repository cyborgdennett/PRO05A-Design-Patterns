package com.example.DriveFactory;

import com.example.Fuels.Diesel;
import com.example.Fuels.Fuel;
import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.DriveTrain.FuelDriveTrain;
import com.example.Parts.Engines.Engine;
import com.example.Parts.Engines.FuelEngine;
import com.example.Parts.Storage.FuelStorage;
import com.example.Parts.Storage.FuelTank;

public class DieselDriveFactory {

    public FuelEngine makeEngine(int hp) {
        return new FuelEngine(new Diesel(), hp);
    }

    public FuelTank makeFuelStorage(float maxCapacity) {
        return new FuelTank(new Diesel(),maxCapacity);
    }

    public DriveTrain makeDriveTrain(FuelEngine engine, FuelTank fuelStorage) {
        return new FuelDriveTrain(engine, fuelStorage);
    }
}
