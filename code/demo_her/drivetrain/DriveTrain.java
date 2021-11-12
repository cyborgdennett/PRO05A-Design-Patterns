package com.company.drivetrain;

import com.company.drivetrain.engine.Engine;
import com.company.drivetrain.fuelstorage.FuelStorage;

public class DriveTrain {

    // Variables
    FuelStorage fuelStorage;
    Engine engine;

    // Constructor
    public DriveTrain(FuelStorage fuelStorage, Engine engine) {
        this.fuelStorage = fuelStorage;
        this.engine = engine;
    }

    //    public void fill(Fuel fuel)
}
