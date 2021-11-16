package com.company.vehicle;

import com.company.parts.Part;

public class ArmyVehicle extends Vehicle {

    // Variables

    // Constructor
    public ArmyVehicle(Vehicle.VehicleBuilder vehicleBuilder) {
        super(vehicleBuilder);
    }

    // Methods
    @Override
    public int rangeLeft() {
        return 0;
    }

    @Override
    public void fill() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void brake() {

    }

}
