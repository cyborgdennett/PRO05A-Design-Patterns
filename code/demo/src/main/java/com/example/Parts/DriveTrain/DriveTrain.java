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
<<<<<<< HEAD
    default public void print(){    
        System.out.println("Drivetrain");
    }
=======
    public void print();

    public String getName();
>>>>>>> 11aa7860cc4d53d9725a045da934e719bde01de3
}