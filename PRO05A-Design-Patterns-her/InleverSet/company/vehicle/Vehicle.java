package com.company.vehicle;

import com.company.drivetrain.DriveTrain;
import com.company.owner.Owner;
import com.company.parts.*;

import java.util.ArrayList;

public abstract class  Vehicle {
    protected String model;
    protected DriveTrain driveTrain;
    protected String color;
    protected Armoring armor;
    protected ArrayList<Part> parts;

    public Vehicle(VehicleBuilder vehicleBuilder){
        this.model = vehicleBuilder.model;
        this.driveTrain = vehicleBuilder.driveTrain;
        this.color = vehicleBuilder.color;
        this.armor = vehicleBuilder.armor;
    }

    public abstract int rangeLeft();
    public abstract void brake();
    public Part removePart(Part part){
        return part;
    };
    public void addPart(Part part){

    };

    public void fill(){
        System.out.println(model + " is filling up.");
    };


    public static class VehicleBuilder {
        public enum Type{
            CIVIL, RACE, ARMY
        }
        // Variables
        public final DriveTrain driveTrain;
        public String model;
        public String color;
        public Type type;
        public Armoring armor;

        // Constructor
        public VehicleBuilder(DriveTrain driveTrain, Type type, String model, String color) {
            this.driveTrain = driveTrain;
            this.model = model;
            this.type = type;
            this.color = color;
        }

        public void armor(Armoring armor){
            this.armor = armor;
        }

        void addNonNecessary() {

        }

        public void print(){
            System.out.println(model);
            System.out.println(driveTrain.toString());
            System.out.println();
        }
        public String toSmallString(){
            return "VehicleBuilder: \n" +
                    "model: " + this.model +
                    " color: " + this.color + "\n";
        }
        @Override
        public String toString(){
            return "VehicleBuilder: \n" +
                    "model: " + model +
                    " color: " + color + "\n" +
                    driveTrain.toString() +
                    armor == null || armor instanceof Armor ? "": armor.toString() + "\n";
        }
    }
    public abstract String toSmallString();
    @Override
    public String toString(){
        return "Vehicle: \n" +
                "model: " + model +
                " color: " + color + "\n" +
                driveTrain.toString() +
                (armor == null || armor instanceof Armor ? "": armor.toString()) + "\n";
    }

    public String getModel(){
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public int price(){
        return driveTrain.price() + (armor == null || armor instanceof Armor ? 0 : armor.price());
    }
    public void drive(){
        System.out.println("Someone steps on the gas");
        driveTrain.drive();
        System.out.println("Speed increased by 10 kmph");
        System.out.println("Some fuel was consumed");
    }
}
