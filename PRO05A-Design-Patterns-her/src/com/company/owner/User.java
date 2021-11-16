package com.company.owner;

import com.company.vehicle.Vehicle;

public class User extends Owner {

    // Methods
    public void drive(){
        vehicles.firstElement().drive();
    }

}
