package com.example.Parts.DriveTrain;


import com.example.Parts.Engines.ElectricEngine;
import com.example.Parts.Storage.Battery;

public class ElectricDriveTrain implements DriveTrain{
    protected ElectricEngine electricEngine;
    protected Battery battery;

    public ElectricDriveTrain(ElectricEngine e, Battery b){
        electricEngine = e;
        battery = b;
    }

    public void drive() {
        //throw exception if there is not enough fuel
        if(battery.get(1) < .5) 
            DriveTrain.super.drive();
        else {
            electricEngine.inject(1);
            System.out.println("DriveTrain: Takes energy from battery and drives engine");    
        }
    }
    public void fill(float amt){
        if(amt <= 0){
            System.out.println("Pass a value higher than 0.");
        }
        else if(battery.fill(amt))
            System.out.println("Filled battery with: "+Float.toString(amt) + "kwh.");
        else
            System.out.println("Can't fill this much.");
    }

    @Override
    public void print() {
        System.out.print("Electric");
    }

    @Override
    public String getName() {
        return "Electric";
    }

}
