package com.company.drivetrain.engine;

public class ElectricEngine implements Engine {

    public ElectricEngine(){

    }
    // Methods
    public void accelerate() {
        System.out.println("Electric Engine is accelerating *silence*");
    }

    public void shiftUp() {
        System.out.println("Electric Engine don't have gears!");
    }

    public void shiftDown() {
        System.out.println("Electric Engine don't have gears!");
    }

    @Override
    public String toString(){
        return "Electric Engine";
    }

    public int price(){
        return 1300;
    }
}
