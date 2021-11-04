package com.example.Vehicles;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.VehicleTypes.CivilCar;

public class CabrioCar extends CivilCar {
    public CabrioCar(DriveTrain driveTrain){
        super(driveTrain);
    }
    public void openRoof(){
        System.out.println("Opening roof!...");
    }

    public void closeRoof(){
        System.out.println("Closing roof!...");
    }
    @Override
    public String getModel() {
        return "Cabrio";
    }
}
