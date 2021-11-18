package com.company.drivetrain;

import com.company.drivetrain.engine.ElectricEngine;
import com.company.drivetrain.engine.Engine;
import com.company.drivetrain.fuelstorage.Battery;
import com.company.drivetrain.fuelstorage.FuelStorage;

public class ElectricAbstractDriveTrainFactory implements AbstractDriveTrainFactory{
    public Engine createEngine(){
        return new ElectricEngine();
    };
    public FuelStorage createFuelStorage(){
        return  new Battery();
    };
    public DriveTrain createDriveTrain(){
        return new DriveTrain(createFuelStorage(),createEngine());
    };
}
