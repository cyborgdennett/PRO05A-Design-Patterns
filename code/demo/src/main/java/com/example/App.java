package com.example;

import com.example.*;
import com.example.Parts.*;
import com.example.Parts.Armoring.*;
import com.example.Vehicles.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
//        Vehicle vehicle = new Vehicle();
        Armoring bombproofArmoring = new BombproofArmoring(500);
        Armoring electronicArmor = new ElectronicArmoring(200);

        Vehicle veh = new SUVCar(new CivilCar());
        Vehicle vehicle = new SUVCar(new CivilCar());
        Tank tankmodel = new Tank();
        tankmodel.setHorsePower(400);
        tankmodel.setNrOfDoors(2);
        tankmodel.setNrOfSeats(12);
        Vehicle tank = new InfantryTank(tankmodel);
        tank.getVehicleType().getHorsePower();
        tank.print();
        vehicle.addPart(bombproofArmoring);
        vehicle.addPart(electronicArmor);
        vehicle.print();



    }
}
