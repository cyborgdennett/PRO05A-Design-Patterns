package com.example.Factories.CarFactory;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.Parts.Rims.Rim;
import com.example.Parts.Seats.Seat;
import com.example.Vehicles.Vehicle;

public class AbstractCarFactory {
    public enum Model{
        SUVCar, F1, CabrioCar, InfantryTank, Nascar, SedanCar
    }

    public enum Fuel{
        Petrol, Diesel, Gas, Electric
    }
    public AbstractCarFactory(){};
}
