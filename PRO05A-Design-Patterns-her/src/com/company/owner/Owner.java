package com.company.owner;

import com.company.vehicle.Vehicle;

import java.util.Vector;

public abstract class Owner {

    // Variables
    Vector<Vehicle> vehicles;

    // Constructor
    public Owner() {
        vehicles = new Vector<>();
    }

    // Abstract methods

    public Vehicle getVehicle() {
        return vehicles.firstElement();
    }

    public Vehicle removeVehicle(Vehicle vehicle) {

        if(!vehicles.contains(vehicle)){
            System.out.println("Vehicle "+ vehicle.toSmallString() +" not in inventory");
            return null;
        }
        else {
            Vehicle v = vehicles.get(vehicles.indexOf(vehicle));
            vehicles.remove(vehicle);
            return v;
        }
    }
    public void trade(Vehicle vehicle, Owner to) {
        removeVehicle(vehicle);
        to.addVehicle(vehicle);
        System.out.println("Vehicle has a new owner!");
    }

    // Methods
    public Vehicle addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
        return vehicle;
    }

    public void printList(){
        for(Vehicle v : vehicles){
            System.out.println(v.toString());
        }
    }

    public boolean trade(String model, int amt, Owner to){
        if(amt > (int)vehicles.stream().filter(t -> t.getModel() == model).count()){
            System.out.println("Owner does not have this amount of the specified cars");
            return false;
        }
        for(int i = 0; i < amt; i++){
            this.trade(vehicles.stream().filter(t -> t.getModel() == model).findFirst().get(), to);
        }
        return true;
    };

}
