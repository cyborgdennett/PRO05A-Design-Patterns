package com.example.Parts.Engines;

public class ElectricEngine extends Engine {

    public ElectricEngine(int pk) {
        super(pk);
    }

    @Override
    public void inject(float amt) {
        System.out.println("Fuel injected");
    }

    @Override
    public void print() {
        System.out.print("Electric");
        super.print();
    }

    @Override
    public String getName() {
        return "Electric engine";
    }
}
