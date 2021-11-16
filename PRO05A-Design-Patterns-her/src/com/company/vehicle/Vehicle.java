package com.company.vehicle;

import com.company.drivetrain.DriveTrain;
import com.company.parts.Part;

import java.util.ArrayList;

public abstract class Vehicle {

    DriveTrain driveTrain;
    String color;
    ArrayList<Part> parts;
    VehicleBuilder vehicleBuilder;
//    Vehicle(VehicleBuilder)
    public abstract int rangeLeft();
//    public abstract void fill(Fuel fuel);
    public abstract void drive();
    public abstract void brake();
    public abstract Part removePart(Part part);
    public abstract void addPart(Part part);

}
