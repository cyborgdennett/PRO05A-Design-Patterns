package com.example.Factories.CarFactory;

import com.example.DriveFactory.DieselDriveFactory;
import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.DriveTrain.FuelDriveTrain;
import com.example.Parts.Engines.Engine;
import com.example.Parts.Rims.DefaultRim;
import com.example.Parts.Rims.Rim;
import com.example.Parts.Seats.LeatherSeat;
import com.example.Parts.Seats.Seat;
import com.example.Parts.Storage.FuelTank;
import com.example.Vehicles.F1;
import com.example.Vehicles.Vehicle;

public class F1Factory implements AbstractCarFactory {

    @Override
    public DriveTrain makeDriveParts() {
        PetrolDriveFactory petrolDriveFactory = new PetrolDriveFactory();
        Engine engine = petrolDriveFactory.makeEngine(150);
        FuelTank fuelTank = petrolDriveFactory.makeFuelStorage(80);
        DriveTrain driveTrain = new FuelDriveTrain(engine, fuelTank)
        return driveTrain;
    }

    @Override
    public Seat makeSeats() {
        Seat seat = new LeatherSeat();
        return seat;
    }

    @Override
    public Rim makeRims() {
        Rim rim = new DefaultRim();
        return rim;
    }

    @Override
    public Vehicle makeCar() {
        Vehicle vehicle = new F1(makeDriveParts());
        return vehicle;
    }
    
}
