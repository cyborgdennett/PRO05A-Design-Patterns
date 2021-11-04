package com.example.Parts.DriveTrain;

import com.example.Fuels.Fuel;

public class HybridDriveTrain implements DriveTrain{
    private ElectricDriveTrain electricDriveTrain;
    private FuelDriveTrain fuelDriveTrain;

    @Override
<<<<<<< HEAD
    public void fill(Fuel fuel, float amt){
        fuelDriveTrain.fill(fuel, amt);
    }
    @Override
    public void fill(float amt){
        electricDriveTrain.fill(amt);
=======
    public void fill(float amt){

>>>>>>> 11aa7860cc4d53d9725a045da934e719bde01de3
    }
    @Override
    public void drive() {
        electricDriveTrain.drive();
        
        fuelDriveTrain.drive();
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
