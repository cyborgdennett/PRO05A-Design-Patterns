package com.example.Vehicles;

import com.example.Trade.Owner;

import java.util.ArrayList;
import java.util.List;

import com.example.Fuels.Fuel;
import com.example.Parts.Armoring.*;
import com.example.Parts.*;

public abstract class Vehicle {
    private Owner owner = null;
    private Fuel fuel = null;
    private List<Part> parts = new ArrayList();
    private VehicleType vehicleType = null;

    public Vehicle(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
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

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void print() {
        System.out.println("This " + vehicleType.getType() + " has: ");
        vehicleType.print();
        for(Part part : parts){
            part.print();
        }
    }
}
