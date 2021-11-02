package com.example.Vehicles;

import com.example.Trade.Owner;

import java.util.ArrayList;
import java.util.List;

import com.example.Fuels.Fuel;
import com.example.Parts.Armoring.*;

public class Vehicle {
    private Owner owner = null;
    private Fuel fuel = null;
    private List<Part> parts = new ArrayList();
    private Armoring[] armorings;

    public Vehicle() {
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
        System.out.print("This vehicle has: ");
        for(Part part : parts){
            part.print();
        }

    }
}
