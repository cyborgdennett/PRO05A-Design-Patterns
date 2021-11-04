package com.example.VehicleTypes;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Vehicles.Vehicle;

public interface RaceCar extends VehicleType {
    public default void overtake(){
        System.out.println("Overtaking!...");
    }
}
