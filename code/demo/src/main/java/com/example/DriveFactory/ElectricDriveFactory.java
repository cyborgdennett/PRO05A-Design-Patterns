package com.example.DriveFactory;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.DriveTrain.ElectricDriveTrain;
import com.example.Parts.Engines.ElectricEngine;
import com.example.Parts.Engines.Engine;
import com.example.Parts.Storage.Battery;
import com.example.Parts.Storage.FuelStorage;
import com.example.Parts.Storage.FuelTank;

public class ElectricDriveFactory implements DriveFactory{

    public ElectricEngine makeEngine(int hp) {
        return new ElectricEngine(hp);
    }

    public Battery makeFuelStorage(float maxCapacity) {
        return new Battery(maxCapacity);
    }

    public ElectricDriveTrain makeDriveTrain(ElectricEngine electricEngine, Battery battery){
        return new ElectricDriveTrain(electricEngine, battery);
    }
}
