package com.example.VehicleTypes;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Vehicles.Vehicle;

public interface Tank extends VehicleType {

    default void shoot(){
        System.out.println("Shooting!...");
    }
}
