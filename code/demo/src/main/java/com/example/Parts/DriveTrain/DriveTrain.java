package com.example.Parts.DriveTrain;


import com.example.Fuels.Fuel;

public interface DriveTrain{
    default public void drive() {
        System.out.println("Not enough fuel");
    }
    default public void fill(float amt){
        System.out.println("Function not available");
    }
    default public void fill(Fuel fuel, float amt){
        System.out.println("Function not available");
    }
    default public void print(){    
        System.out.println("Drivetrain");
    }
    public String getName();
}