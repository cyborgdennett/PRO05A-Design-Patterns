package com.example.Factories.CarFactory;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.DriveTrain.ElectricDriveTrain;
import com.example.Parts.Rims.DefaultRim;
import com.example.Parts.Rims.Rim;
import com.example.Parts.Seats.FabricSeat;
import com.example.Parts.Seats.Seat;
import com.example.Vehicles.SUVCar;
import com.example.Vehicles.Vehicle;

public class SUVFactory implements AbstractCarFactory {

    @Override
    public DriveTrain makeDriveParts() {
        DriveTrain driveTrain = new ElectricDriveTrain();
        return driveTrain;
    }

    @Override
    public Seat makeSeats() {
        Seat seat = new FabricSeat();
        return seat;
    }

    @Override
    public Rim makeRims() {
        Rim rim = new DefaultRim();
        return rim;
    }

    @Override
    public Vehicle makeCar() {
        Vehicle vehicle = new SUVCar(makeDriveParts());
        return vehicle;
    }
    
}
