package com.example.Parts.DriveTrain;

import javax.crypto.ExemptionMechanismException;

import com.example.Fuels.Fuel;
import com.example.Parts.Engines.ElectricEngine;
import com.example.Parts.Storage.FuelTank;

public class FuelDriveTrain implements DriveTrain{
    private ElectricEngine fuelEngine;
    private FuelTank fuelTank;
    @Override
    public void drive() throws ExemptionMechanismException {
        if(fuelTank.get(1) == 0) 
            throw new ExemptionMechanismException();
        fuelEngine.inject(fuelTank.getFuel(), 1);
    }
    @Override
    public void fill(Fuel fuel, float amt){
        try{fuelTank.fill(fuel, amt);}
        catch(Exception e){e.printStackTrace();}
    }
    
}
