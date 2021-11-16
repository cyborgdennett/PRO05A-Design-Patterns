package Vehicle;

import DriveTrain.DriveTrain;

public abstract class Vehicle {
    private DriveTrain driveTrain;
    private String model;
//    private Part[] parts;
    private VehicleBuilder vehicleBuilder;
    public Vehicle(VehicleBuilder vehicleBuilder){
        this.vehicleBuilder = vehicleBuilder;
    }

    public void drive() {
        System.out.println("Driving");
    }

    public void brake(){
        System.out.println("Braking");
    }

}
