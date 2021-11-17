package com.company.owner;

import com.company.vehicle.Vehicle;

public class Dealer extends Owner {

    public Dealer(){};

    // Methods
    public void paintJob(Vehicle vehicle, String color){
        vehicle.setColor(color);
    }

}
