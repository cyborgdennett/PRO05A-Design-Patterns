package com.company.owner;

import com.company.vehicle.Vehicle;

public class Dealer extends Owner {

    Factory factory;

    public Dealer (Factory factory) {
        this.factory = factory;
    }

    // Methods
    @Override
    public Vehicle getVehicle(int vehicle) {
        return super.vehicles.get(vehicle);
    }






    @Override
    public void trade(Vehicle vehicle, Owner to) {
        removeVehicle(vehicle);
        to.addVehicle(vehicle);
        System.out.println("Vehicle has now a new owner!");
    }

    Vehicle orderVehicleFromFactory(Vehicle.VehicleBuilder vehicleBuilder) {
        factory.changeBuilder(vehicleBuilder);
        return factory.createVehicle();
    }

}
