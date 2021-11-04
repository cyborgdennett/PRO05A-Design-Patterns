package com.example.Parts.DriveTrain;

import com.example.Parts.Engines.ElectricEngine;
import com.example.Parts.Engines.Engine;
import com.example.Parts.Storage.Battery;
import com.example.Parts.Storage.FuelTank;

public class HybridDriveTrain implements DriveTrain{
    private ElectricDriveTrain electricDriveTrain;
    private FuelDriveTrain fuelDriveTrain;

    @Override
    public void fill(float amt){

    }
    @Override
    public void drive() {
        try{
            electricDriveTrain.drive();
        } catch(Exception e){e.printStackTrace();}
        try{
            fuelDriveTrain.drive();
        } catch(Exception e){e.printStackTrace();}
    }
    @Override
    public void print(){
        System.out.print("Hybrid");
    }

    @Override
    public String getName() {
        return "Hybrid";
    }
}
