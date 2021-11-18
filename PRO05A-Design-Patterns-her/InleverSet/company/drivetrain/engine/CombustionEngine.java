package com.company.drivetrain.engine;

public class CombustionEngine implements Engine {

    public void accelerate() {
        System.out.println("Combustion Engine is accelerating *vroooom*");
    }

    public void shiftUp() {
        System.out.println("Combustion Engine is shifting its gears up!");
    }

    public void shiftDown() {
        System.out.println("Combustion Engine is shifting its gears down!");
    }

    @Override
    public String toString(){
        return "Combustion Engine";
    }

    public int price(){
        return 1800;
    }
}
