package com.example.Parts.DriveTrain;


import com.example.Fuels.Fuel;
import com.example.Parts.Engines.FuelEngine;
import com.example.Parts.Storage.FuelTank;

public class FuelDriveTrain implements DriveTrain{
    private FuelEngine fuelEngine;
    private FuelTank fuelTank;

    public FuelDriveTrain(FuelEngine fuelEngine, FuelTank fuelTank){
        this.fuelEngine = fuelEngine;
        this.fuelTank = fuelTank;
    }

    @Override
    public void drive() {
        if(fuelTank.get(1) == 0) 
            DriveTrain.super.drive();
        else
            try{
                fuelEngine.inject(fuelTank.getFuel(), 1);
                System.out.println("Accellerating..");
            }
            catch(Exception e){e.printStackTrace();}
    }
    @Override
    public void fill(Fuel fuel, float amt){
        try{fuelTank.fill(fuel, amt);}
        catch(Exception e){e.printStackTrace();}
    }
    @Override
    public void print(){
        System.out.println(fuelEngine.getFuel() + " Drivetrain");
    }

    public String getName(){
        return fuelEngine.getFuel() + "Engine";
    }
    
}
