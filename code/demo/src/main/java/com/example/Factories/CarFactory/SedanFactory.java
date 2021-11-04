package com.example.Factories.CarFactory;

import com.example.DriveFactory.DieselDriveFactory;
import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.DriveTrain.FuelDriveTrain;
import com.example.Parts.DriveTrain.HybridDriveTrain;
import com.example.Parts.Engines.Engine;
import com.example.Parts.Rims.ChromeRim;
import com.example.Parts.Rims.Rim;
import com.example.Parts.Seats.LeatherSeat;
import com.example.Parts.Seats.Seat;
import com.example.Parts.Storage.FuelTank;
import com.example.Vehicles.SedanCar;
import com.example.Vehicles.Vehicle;

public class SedanFactory implements AbstractCarFactory {

    @Override
    public DriveTrain makeDriveParts() {
        DieselDriveFactory dieselDriveFactory = new DieselDriveFactory();
        Engine e = dieselDriveFactory.makeEngine(200);
        FuelTank fuelTank = dieselDriveFactory.makeFuelStorage(80);
        DriveTrain driveTrain = new FuelDriveTrain(e, fuelTank)
        return driveTrain;
    }

    @Override
    public Seat makeSeats() {
        Seat seat = new LeatherSeat();
        return seat;
    }

    @Override
    public Rim makeRims() {
        Rim rim = new ChromeRim();
        return rim;
    }

    @Override
    public Vehicle makeCar() {
        Vehicle vehicle = new SedanCar(makeDriveParts());
        return vehicle;
    }
    
}
