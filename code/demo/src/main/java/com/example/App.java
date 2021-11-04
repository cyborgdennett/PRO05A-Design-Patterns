package com.example;

import com.example.Parts.Armoring.*;
import com.example.Parts.DriveTrain.ElectricDriveTrain;
import com.example.Parts.DriveTrain.FuelDriveTrain;
import com.example.Parts.Engines.ElectricEngine;
import com.example.VehicleTypes.CivilCar;
import com.example.VehicleTypes.RaceCar;
import com.example.VehicleTypes.Tank;
import com.example.VehicleTypes.*;
import com.example.Vehicles.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
//        Vehicle vehicle = new Vehicle();
        Armoring bombproofArmoring = new BombproofArmoring(500);
        Armoring electronicArmor = new ElectronicArmoring(200);

        Vehicle veh = new SUVCar(new ElectricDriveTrain());
        Vehicle vehicle = new SUVCar(new FuelDriveTrain());
        Tank tankmodel = new InfantryTank(new FuelDriveTrain());
        tankmodel.setNrOfDoors(2);
        tankmodel.setNrOfSeats(12);
        InfantryTank tank = new InfantryTank(new FuelDriveTrain());
        tank.print();
        vehicle.addPart(bombproofArmoring);
        vehicle.addPart(electronicArmor);
        vehicle.print();

        CabrioCar carbio = new CabrioCar(new ElectricDriveTrain());
        carbio.print();
        carbio.addPart(new ElectricEngine(200));

        SedanCar sedan = new SedanCar(new FuelDriveTrain());
        sedan.print();
        sedan.setNrOfDoors(3);







    }
}
