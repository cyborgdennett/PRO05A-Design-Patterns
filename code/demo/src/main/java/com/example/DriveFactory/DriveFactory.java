package com.example.DriveFactory;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.Engines.Engine;
import com.example.Parts.Storage.FuelTank;

public interface DriveFactory {
    public Engine makeEngine();
    public FuelTank makeFuelStorage(float maxCapacity);
    public DriveTrain driveTrain();
}
