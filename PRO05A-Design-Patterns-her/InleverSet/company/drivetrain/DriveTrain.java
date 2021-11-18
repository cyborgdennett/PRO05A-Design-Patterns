package com.company.drivetrain;

import com.company.drivetrain.engine.CombustionEngine;
import com.company.drivetrain.engine.ElectricEngine;
import com.company.drivetrain.engine.Engine;
import com.company.drivetrain.fuelstorage.Battery;
import com.company.drivetrain.fuelstorage.FuelStorage;
import com.company.drivetrain.fuelstorage.GasStorage;
import com.company.drivetrain.fuelstorage.LiquidStorage;

public class DriveTrain {

    // Variables
    private FuelStorage fuelStorage;
    private Engine engine;

    // Constructor
    public DriveTrain(FuelStorage fuelStorage, Engine engine) throws IllegalArgumentException{
        if(fuelStorage instanceof Battery  && engine instanceof ElectricEngine ||
                ((fuelStorage instanceof LiquidStorage || fuelStorage instanceof GasStorage) && engine instanceof CombustionEngine))
        {
            this.fuelStorage = fuelStorage;
            this.engine = engine;
        }
        else {
            throw new IllegalArgumentException("Engine must match Fuelstorage type!");
        }
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

    public int price(){
        return engine.price() + fuelStorage.price();
    }
    public void drive(){
        fuelStorage.use();
        engine.accelerate();
    }
}
