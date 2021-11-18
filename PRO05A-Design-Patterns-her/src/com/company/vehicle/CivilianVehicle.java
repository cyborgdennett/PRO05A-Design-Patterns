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

    @Override
    public int price(){//Civilian cars are cheap
        return (int)(super.price() * 1.2);
    }

    @Override
    public String toString(){
        return "Civilian" + super.toString();
    }
    public String toSmallString(){
        return "CivilianVehicle:" +
                "model: " + model +
                " color: " + color + "\n";
    }
}
