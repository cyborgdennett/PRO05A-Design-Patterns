package com.example.Vehicles;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.VehicleTypes.CivilCar;

public class SedanCar extends CivilCar {


    public SedanCar(DriveTrain driveTrain) {
        super(driveTrain);
        super.setNrOfDoors(5);
        super.setNrOfSeats(4);
    }

    @Override
    public String getModel() {
        return "Sedan";
    }

}