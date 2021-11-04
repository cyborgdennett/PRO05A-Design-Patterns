package com.example;

import com.example.DriveFactory.DieselDriveFactory;
import com.example.DriveFactory.ElectricDriveFactory;
import com.example.DriveFactory.PetrolDriveFactory;
import com.example.Factories.CarFactory.CabrioCarFactory;
import com.example.Factories.CarFactory.SUVFactory;
import com.example.Parts.Armoring.*;
import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.DriveTrain.ElectricDriveTrain;
import com.example.Parts.DriveTrain.FuelDriveTrain;
import com.example.Parts.Engines.ElectricEngine;
import com.example.Parts.Rims.DefaultRim;
import com.example.Parts.Seats.FabricSeat;
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

        DieselDriveFactory ddf = new DieselDriveFactory();
        DriveTrain ddf1 = ddf.makeDriveTrain(ddf.makeEngine(200), ddf.makeFuelStorage(50));

        ElectricDriveFactory edf= new ElectricDriveFactory();
        DriveTrain edf1 = edf.makeDriveTrain(edf.makeEngine(250),edf.makeFuelStorage(60));

        PetrolDriveFactory pdf = new PetrolDriveFactory();
        DriveTrain pdf1 = pdf.makeDriveTrain(pdf.makeEngine(195),pdf.makeFuelStorage(30));

        SUVCar suvCar = new SUVCar(ddf1);
        InfantryTank infantryTank = new InfantryTank(ddf1);

        infantryTank.addPart(bombproofArmoring);
        infantryTank.print();
        infantryTank.addPart(electronicArmor);
        infantryTank.print();
        infantryTank.removePart(bombproofArmoring);
        infantryTank.print();

        F1 f1 = new F1(pdf1);
        CabrioCar cabrioCar = new CabrioCar(edf1);
        f1.print();
        f1.addPart(new FabricSeat());
        f1.print();
        f1.addPart(new DefaultRim());
        cabrioCar.openRoof();







    }
}
