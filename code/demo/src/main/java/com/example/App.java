package com.example;

import com.example.*;
import com.example.Parts.*;
import com.example.Vehicles.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Vehicle vehicle = new Vehicle();
        Armoring bombproofArmoring = new BombproofArmoring(500);
        bombproofArmoring.print();
        vehicle.addPart(bombproofArmoring);
        vehicle.print();

    }
}
