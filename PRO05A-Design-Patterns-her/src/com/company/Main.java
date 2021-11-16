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
import com.company.drivetrain.engine.ElectricEngine;
import com.company.drivetrain.fuelstorage.Battery;
import com.company.drivetrain.fuelstorage.LiquidStorage;
import com.company.owner.Dealer;
import com.company.owner.Factory;
import com.company.owner.Owner;
import com.company.owner.User;
import com.company.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {

        Vehicle.VehicleBuilder vehicleBuilder = new Vehicle.VehicleBuilder(new DriveTrain(new LiquidStorage(), new CombustionEngine()), Vehicle.VehicleBuilder.Type.RACE,"F1", "red");
        Factory factory = new Factory(new Vehicle.VehicleBuilder(new DriveTrain(new LiquidStorage(), new CombustionEngine()), Vehicle.VehicleBuilder.Type.RACE, "F1", "red"));

        Owner dealer = new Dealer(factory);
        Factory sedanFactory = new Factory(new Vehicle.VehicleBuilder(new DriveTrain(new Battery(), new ElectricEngine()), Vehicle.VehicleBuilder.Type.CIVIL, "Sedan", "blue"));
        sedanFactory.trade(sedanFactory.createVehicle(), dealer);

        Owner user = new User();
        dealer.addVehicle(factory.createVehicle());
        dealer.getVehicle(0).fill();

        dealer.trade(dealer.getVehicle(0), user);
        user.getVehicle(0).drive();
        user.printList();

    }
}
