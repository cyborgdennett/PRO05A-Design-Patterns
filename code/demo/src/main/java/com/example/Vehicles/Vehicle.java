package com.example.Vehicles;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Trade.Owner;

import java.util.ArrayList;
import java.util.List;

import com.example.Fuels.Fuel;
import com.example.Parts.*;
import com.example.VehicleTypes.CivilCar;
import com.example.VehicleTypes.VehicleType;

public abstract class Vehicle/*<T extends VehicleType>*/{
//    public enum model{
//        Sedan, SUV
//    }

    private Owner owner = null;
    private Fuel fuel = null;
    private List<Part> parts = new ArrayList();
    private DriveTrain driveTrain;
    protected int nrOfSeats, nrOfDoors;

    public Vehicle(DriveTrain driveTrain) {
        this.driveTrain = driveTrain;
    }

    public abstract String getModel();
    public abstract String getType();

    public DriveTrain getDriveTrain() {
        return driveTrain;
    }

    public void setDriveTrain(DriveTrain driveTrain) {
        this.driveTrain = driveTrain;
    }

    public int getNrOfSeats() {
        return nrOfSeats;
    }

    public void setNrOfSeats(int nrOfSeats) {
        this.nrOfSeats = nrOfSeats;
    }

    public int getNrOfDoors() {
        return nrOfDoors;
    }

    public void setNrOfDoors(int nrOfDoors) {
        this.nrOfDoors = nrOfDoors;
    }
    public int rangeLeft() {
        return 100;
    }

    public void fill(int amountOfFuel) {
        System.out.println("Added fuel");
    }

    public void drive() {
        System.out.println("DRIVING");
    }

    public void removePart(Part part) {
        this.parts.remove(part);
    }

    public void addPart(Part part) {
        this.parts.add(part);
    }

    public void print() {
        System.out.println("This "+ getModel()  + " is a "+ getType() +  " and it has: ");
        System.out.println("\tDrivetrain: " + driveTrain.getName());
        System.out.println("\tParts:");
        for(Part part : parts){
            System.out.print("\t\t");
            part.print();
        }
    }
}
