package com.company.vehicle;

import com.company.parts.Part;

public class CivilianVehicle extends Vehicle {

    // Variables
    String type;

    // Constructor
    public CivilianVehicle(String type) {
        this.type = type;
    }

    // Methods
    @Override
    public int rangeLeft() {
        return 0;
    }

    @Override
    public void drive() {

    }

    @Override
    public void brake() {

    }

    @Override
    public Part removePart(Part part) {
        return null;
    }

    @Override
    public void addPart(Part part) {

    }

    // void createType(type)
}
