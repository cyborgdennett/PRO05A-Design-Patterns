package com.example.Parts.DriveTrain;

import com.example.Fuels.Fuel;

public class HybridDriveTrain implements DriveTrain{
    private ElectricDriveTrain electricDriveTrain;
    private FuelDriveTrain fuelDriveTrain;

    @Override
    public void fill(Fuel fuel, float amt){
        fuelDriveTrain.fill(fuel, amt);
    }
    @Override
    public void fill(float amt){
        electricDriveTrain.fill(amt);
    }
    @Override
    public void drive() {
        electricDriveTrain.drive();
        
        fuelDriveTrain.drive();
    }
    @Override
    public void print(){
        DriveTrain.super.print();

    }
}
