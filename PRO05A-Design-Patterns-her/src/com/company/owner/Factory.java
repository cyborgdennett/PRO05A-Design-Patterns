package com.company.owner;

import com.company.vehicle.Vehicle;
import com.company.vehicle.VehicleBuilder;

public class Factory extends Owner {

    // Variables
    VehicleBuilder vehicleBuilder;

    // Constructor
    public Factory(VehicleBuilder vehicleBuilder) {
        this.vehicleBuilder = vehicleBuilder;
    }

    // Methods
    @Override
    public void getVehicle(Vehicle vehicle) {

    }

    @Override
    public void giveVehicle(int vehicle) {

    }

    /*
    Factory(VehicleBuilder);
     */

    public Vehicle createRaceVehicle(VehicleBuilder vehicleBuilder) {
        return null;
    }

    public Vehicle createCivilianVehicle(VehicleBuilder vehicleBuilder) {
        return null;
    }

    public Vehicle createArmyVehicle(VehicleBuilder vehicleBuilder) {
        return null;
    }

    // Setter
    public void changeBuilder(VehicleBuilder vehicleBuilder) {
        this.vehicleBuilder = vehicleBuilder;
    }
}
