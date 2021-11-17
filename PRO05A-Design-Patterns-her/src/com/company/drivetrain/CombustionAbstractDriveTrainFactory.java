package com.company.drivetrain;

import com.company.drivetrain.engine.CombustionEngine;
import com.company.drivetrain.engine.Engine;
import com.company.drivetrain.fuelstorage.FuelStorage;
import com.company.drivetrain.fuelstorage.LiquidStorage;

public class CombustionAbstractDriveTrainFactory {
    public Engine createEngine(){
        return new CombustionEngine();
    };
    public FuelStorage createFuelStorage(){
        return new LiquidStorage();
    };
    public DriveTrain createDriveTrain(){
        return new DriveTrain(createFuelStorage(), createEngine());
    };
}
