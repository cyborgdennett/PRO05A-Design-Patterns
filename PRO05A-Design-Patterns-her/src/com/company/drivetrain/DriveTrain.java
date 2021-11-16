package com.company.drivetrain;

import com.company.drivetrain.engine.Engine;
import com.company.drivetrain.fuelstorage.FuelStorage;

public class DriveTrain {

    // Variables
    private FuelStorage fuelStorage;
    private Engine engine;

    // Constructor
    public DriveTrain(FuelStorage fuelStorage, Engine engine) {
        this.fuelStorage = fuelStorage;
        this.engine = engine;
    }

    public FuelStorage getFuelStorage() {
        return fuelStorage;
    }

    public void setFuelStorage(FuelStorage fuelStorage) {
        this.fuelStorage = fuelStorage;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString(){
        return engine.toString() + " " + fuelStorage.toString();
    }
}
