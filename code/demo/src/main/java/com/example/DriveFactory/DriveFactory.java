package com.example.DriveFactory;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.Engines.Engine;
import com.example.Parts.Storage.Battery;
import com.example.Parts.Storage.FuelStorage;
import com.example.Parts.Storage.FuelTank;

public interface DriveFactory {
     public Engine makeEngine(int hp);
     public FuelStorage makeFuelStorage(float maxCapacity);
//     public DriveTrain makeDriveTrain(Engine engine, FuelStorage fuelStorage);
}
