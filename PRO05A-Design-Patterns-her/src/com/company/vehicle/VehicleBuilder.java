package com.company.vehicle;

import com.company.drivetrain.DriveTrain;
import com.company.owner.Owner;
import com.company.parts.Armoring;

public class VehicleBuilder {

    // Variables
    DriveTrain driveTrain;
    Owner owner;
    String model;
    Armoring armor;
    String color;

    // Constructor
    public VehicleBuilder(DriveTrain driveTrain, Owner owner, String model, Armoring armor, String color) {
        this.driveTrain = driveTrain;
        this.owner = owner;
        this.model = model;
        this.armor = armor;
        this.color = color;
    }

    // Methods
    VehicleBuilder vehicleBuilder(Owner owner, String s, DriveTrain driveTrain) {
        return null;
    }

    Vehicle build() {
        return null;
    }

    void addNonNecessary() {

    }

    void setColor(String s) {

    }

    void setArmor(Armoring armoring) {

    }
}
