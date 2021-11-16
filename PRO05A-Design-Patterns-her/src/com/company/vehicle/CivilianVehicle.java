package com.company.vehicle;

import com.company.parts.Part;

public class CivilianVehicle extends Vehicle {

    // Variables

    // Constructor
    public CivilianVehicle(Vehicle.VehicleBuilder vehicleBuilder) {
        super(vehicleBuilder);
    }

    // Methods
    @Override
    public int rangeLeft() {
        return 0;
    }

    @Override
    public void fill() {
        System.out.println("Filling up: " + driveTrain.getFuelStorage().getClass());
    }

    @Override
    public void drive() {

    }

    @Override
    public void brake() {

    }
}
