package com.company.owner;

import com.company.vehicle.Vehicle;

import java.util.ArrayList;

public abstract class Owner {

    ArrayList<Vehicle> vehicles;
    public abstract void getVehicle(Vehicle vehicle);
    public abstract void giveVehicle(int vehicle);
//    public abstract Trade(Owner to, Owner from);

}
