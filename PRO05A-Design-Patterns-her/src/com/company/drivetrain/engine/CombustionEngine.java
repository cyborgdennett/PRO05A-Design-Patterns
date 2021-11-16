package com.company.drivetrain.engine;

public class CombustionEngine implements Engine {

    @Override
    public void accelerate() {
        System.out.println("Combustion Engine is accelerating *vroooom*");
    }

    @Override
    public void shiftUp() {
        System.out.println("Combustion Engine is shifting its gears up!");
    }

    @Override
    public void shiftDown() {
        System.out.println("Combustion Engine is shifting its gears down!");
    }

    @Override
    public String toString(){
        return "Combustion Engine";
    }
}
