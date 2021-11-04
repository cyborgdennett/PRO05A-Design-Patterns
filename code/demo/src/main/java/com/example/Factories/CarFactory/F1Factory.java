package com.example.Factories.CarFactory;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.DriveTrain.FuelDriveTrain;
import com.example.Parts.Rims.DefaultRim;
import com.example.Parts.Rims.Rim;
import com.example.Parts.Seats.LeatherSeat;
import com.example.Parts.Seats.Seat;
import com.example.Vehicles.F1;
import com.example.Vehicles.Vehicle;

public class F1Factory implements AbstractCarFactory {

    @Override
    public DriveTrain makeDriveParts() {
        DriveTrain driveTrain = new FuelDriveTrain();
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
