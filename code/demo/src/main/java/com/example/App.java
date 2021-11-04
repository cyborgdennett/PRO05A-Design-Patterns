package com.example;

import com.example.Parts.Armoring.*;
import com.example.VehicleTypes.CivilCar;
import com.example.VehicleTypes.Tank;
import com.example.Vehicles.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
//        Vehicle vehicle = new Vehicle();
        Armoring bombproofArmoring = new BombproofArmoring(500);
        Armoring electronicArmor = new ElectronicArmoring(200);

        Vehicle veh = new SUVCar();
        Vehicle vehicle = new SUVCar();
        Tank tankmodel = new InfantryTank();
        tankmodel.setNrOfDoors(2);
        tankmodel.setNrOfSeats(12);
        Vehicle tank = new InfantryTank();
        tank.print();
        vehicle.addPart(bombproofArmoring);
        vehicle.addPart(electronicArmor);
        vehicle.print();



    }
}
