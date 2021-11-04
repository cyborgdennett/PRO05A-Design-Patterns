package com.example.Vehicles;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.VehicleTypes.CivilCar;

public class CabrioCar extends Vehicle implements CivilCar {
    public CabrioCar(DriveTrain driveTrain){
        super(driveTrain);

    }

    @Override
    public String getModel() {
        return "CabrioCar";
    }

    @Override
    public String getType() {
        return "CivilCar";
    }

    public void openRoof(){
        System.out.println("Opening roof!...");
    }

    public void closeRoof(){
        System.out.println("Closing roof!...");
    }

    @Override
    public void drive() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void fill() {

    }

    @Override
    public String getName() {
        return "Cabrio";
    }
}
