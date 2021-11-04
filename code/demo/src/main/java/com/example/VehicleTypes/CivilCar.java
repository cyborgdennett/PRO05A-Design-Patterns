package com.example.VehicleTypes;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Vehicles.Vehicle;

public interface CivilCar extends VehicleType {
    public default void park(){
        System.out.println("Parking!...");
    }
}
