package com.example.Vehicles;

import com.example.Parts.DriveTrain.DriveTrain;
import com.example.VehicleTypes.CivilCar;

public class SUVCar extends CivilCar {
    public SUVCar(DriveTrain driveTrain) {
        super(driveTrain);
        super.setNrOfDoors(5);
        super.setNrOfSeats(7);
    }
    @Override
    public String getModel() {
        return "SUV";
    }


}