package com.company.owner;

import com.company.vehicle.Vehicle;

public class User extends Owner {

    // Methods
    Vehicle orderVehicleFromDealer(Dealer dealer, Vehicle.VehicleBuilder vehicleBuilder) {
        return dealer.orderVehicleFromFactory(vehicleBuilder);
    }

}
