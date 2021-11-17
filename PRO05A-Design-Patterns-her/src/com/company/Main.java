/*
Design Patterns eindopdracht (2e poging)
Door:
  Auke Blankwaard
  Casper Belier
  Jeroen Tuithof
  Stijn Driessen
  Joris van Tets
 */

package com.company;

import com.company.drivetrain.DriveTrain;
import com.company.drivetrain.engine.CombustionEngine;
import com.company.drivetrain.fuelstorage.LiquidStorage;
import com.company.owner.Dealer;
import com.company.owner.Factory;
import com.company.owner.User;
import com.company.parts.*;
import com.company.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {

        //Create vehicleBuilders
        Vehicle.VehicleBuilder audi = new Vehicle.VehicleBuilder(new DriveTrain(new LiquidStorage(), new CombustionEngine()), Vehicle.VehicleBuilder.Type.RACE,"Audi A8", "white");
        Vehicle.VehicleBuilder ferrari = new Vehicle.VehicleBuilder(new DriveTrain(new LiquidStorage(), new CombustionEngine()), Vehicle.VehicleBuilder.Type.RACE,"Ferrari Monza", "red");
        Vehicle.VehicleBuilder tank = new Vehicle.VehicleBuilder(new DriveTrain(new LiquidStorage(), new CombustionEngine()), Vehicle.VehicleBuilder.Type.RACE,"LuftWaffe Z-88", "Camo");

        //Add armor to the tank
        Armoring armor = new Armor();
        armor = new BulletproofArmoring(armor, 5);
        armor = new BombproofArmoring(armor, 10);

        //add armor to builder (Builder PATTERN)
        tank.armor(armor);

        //Create factory and add an builder
        Factory sportCarManufacturer = new Factory(ferrari);
        Factory tankFactory = new Factory(tank);

        //Build 5 Cars.
        sportCarManufacturer.createVehicle(5);

        //Check the price of the Monza
        System.out.println("Price of Ferrari Monza: " + sportCarManufacturer.getVehicle().price());

        //change builder
        sportCarManufacturer.changeBuilder(audi);

        //Build 10 Cars.
        sportCarManufacturer.createVehicle(10);

        //Check the price of the audi.
        System.out.println("Price of Audi A8: " + sportCarManufacturer.getVehicle().price());

        //show list of cars from the factory:
        sportCarManufacturer.printList();

        //Create Dealer and order 6 audi's and 2 ferrari's as the Dealer
        Dealer sportsDealer = new Dealer();
        sportCarManufacturer.trade("Audi A8", 6, sportsDealer);
        sportCarManufacturer.trade("Ferrari Monza", 2, sportsDealer);


        //print the bought cars.
        sportsDealer.printList();

        //Sell to a user.
        User richBoy = new User();

        sportCarManufacturer.trade("Ferrari Monza", 1, richBoy);

        richBoy.printList();

        //RichBoy is not happy with the color red and wants a repaint. So he goes to the dealer
        sportsDealer.paintJob(richBoy.getVehicle(), "Purple");

        richBoy.printList();

        //richBoy wants to drive in his fast car
        richBoy.drive();
    }
}
