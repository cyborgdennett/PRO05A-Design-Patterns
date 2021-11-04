package com.example.Factories.CarFactory;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.Rims.Rim;
import com.example.Parts.Seats.Seat;
import com.example.Vehicles.Vehicle;

public abstract interface AbstractCarFactory {
    DriveTrain makeDriveParts();
    Seat makeSeats();
    Rim makeRims();
    Vehicle makeCar();
}
