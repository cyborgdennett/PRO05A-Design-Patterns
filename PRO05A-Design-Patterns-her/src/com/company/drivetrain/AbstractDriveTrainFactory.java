package com.company.drivetrain;

import com.company.drivetrain.engine.Engine;
import com.company.drivetrain.fuelstorage.FuelStorage;

public interface AbstractDriveTrainFactory {
    public Engine createEngine();
    public FuelStorage createFuelStorage();
    public DriveTrain createDriveTrain();
}
