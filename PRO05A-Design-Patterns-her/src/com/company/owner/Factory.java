package com.company.owner;

import com.company.vehicle.ArmyVehicle;
import com.company.vehicle.CivilianVehicle;
import com.company.vehicle.RaceVehicle;
import com.company.vehicle.Vehicle;

public class Factory extends Owner {

    // Variables
    private Vehicle.VehicleBuilder vehicleBuilder;

    // Constructor
    public Factory(Vehicle.VehicleBuilder vehicleBuilder) {
        this.vehicleBuilder = vehicleBuilder;
    }

    // Methods

    public Vehicle createVehicle(){
        if (vehicleBuilder.type == Vehicle.VehicleBuilder.Type.RACE) {
            return createRaceVehicle();
        } else if (vehicleBuilder.type == Vehicle.VehicleBuilder.Type.CIVIL) {
            return createCivilianVehicle();
        } else if (vehicleBuilder.type == Vehicle.VehicleBuilder.Type.ARMY) {
            return createArmyVehicle();
        } else {
            return null;
        }
    }

    private Vehicle createRaceVehicle() {
        return new RaceVehicle(this.vehicleBuilder);
    }

    private Vehicle createCivilianVehicle() {
        return new CivilianVehicle(this.vehicleBuilder);
    }

    private Vehicle createArmyVehicle() {
        return new ArmyVehicle(this.vehicleBuilder);
    }

    // Setter
    public void changeBuilder(Vehicle.VehicleBuilder vehicleBuilder) {
        this.vehicleBuilder = vehicleBuilder;
    }


}
