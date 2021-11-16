package com.company.vehicle;

import com.company.parts.Part;

public class RaceVehicle extends Vehicle {

    // Variables


    // Constructor
    public RaceVehicle(Vehicle.VehicleBuilder vehicleBuilder) {
        super(vehicleBuilder);
    }

    // Methods
    @Override
    public int rangeLeft() {
        return 0;
    }

    @Override
    public void fill() {
        System.out.println("Filling up fast like race car." + super.driveTrain.getFuelStorage().toString());
    }

    @Override
    public void drive() {
        super.driveTrain.getFuelStorage().use();
        System.out.println("RACING!");
    }

    @Override
    public void brake() {
        System.out.println("Braking!");
    }

    @Override
    public int price(){ //Sport cars are expensive.
        return (int)(super.price() * 1.6);
    }
}
