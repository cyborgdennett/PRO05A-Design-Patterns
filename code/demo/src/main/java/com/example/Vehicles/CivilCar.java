package com.example.Vehicles;

public class CivilCar extends VehicleType{
    public CivilCar() {

    }

    @Override
    public String getType() {
        return "civilcar";
    }


    @Override
    public void setHorsePower(int horsePower) {
        super.horsePower = horsePower;
    }
}
