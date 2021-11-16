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

    public Boolean createVehicle(int amt){
        try {
            Vehicle newVehicle;
            switch (vehicleBuilder.type) {
                case RACE:
                    newVehicle = createRaceVehicle();
                    break;
                case CIVIL:
                    newVehicle = createCivilianVehicle();
                    break;
                case ARMY:
                    newVehicle = createArmyVehicle();
                    break;
                default:
                    return false;
            }
            for(int i = 0; i < amt; i++){
                vehicles.add(newVehicle);
            }
            System.out.println(Integer.toString(amt) + " Vehicle(s) build..");
            return true;
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
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
