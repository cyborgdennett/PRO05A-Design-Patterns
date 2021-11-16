package com.company.drivetrain.engine;

public class ElectricEngine implements Engine {

    // Methods
    @Override
    public void accelerate() {
        System.out.println("Electric Engine is accelerating *silence*");
    }

    @Override
    public void shiftUp() {
        System.out.println("Electric Engine is shifting its gears up!");
    }

    @Override
    public void shiftDown() {
        System.out.println("Electric Engine is shifting its gears down!");
    }

    @Override
    public String toString(){
        return "Electric Engine";
    }
}
