package com.example.DriveFactory;

import com.example.Fuels.Diesel;
import com.example.Fuels.Fuel;
import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.DriveTrain.FuelDriveTrain;
import com.example.Parts.Engines.Engine;
import com.example.Parts.Engines.FuelEngine;
import com.example.Parts.Storage.FuelStorage;
import com.example.Parts.Storage.FuelTank;

public class DieselDriveFactory implements DriveFactory{

    @Override
    public Engine makeEngine(int hp) {
        return new FuelEngine(new Diesel(), hp);
    }

    @Override
    public FuelStorage makeFuelStorage(float maxCapacity) {
        return new FuelTank(new Diesel(),maxCapacity);
    }
}
