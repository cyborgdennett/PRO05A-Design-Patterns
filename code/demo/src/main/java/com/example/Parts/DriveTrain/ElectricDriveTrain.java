package com.example.Parts.DriveTrain;

import com.example.Parts.Engines.ElectricEngine;
import com.example.Parts.Storage.Battery;

public class ElectricDriveTrain implements DriveTrain{
    private ElectricEngine electricEngine;
    private Battery battery;
    @Override
    public void drive() {

        System.out.println("DriveTrain: Takes energy from battery and drives engine");
        
    }

}
