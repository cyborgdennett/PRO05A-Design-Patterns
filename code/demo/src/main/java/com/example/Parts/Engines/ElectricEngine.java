package com.example.Parts.Engines;

public class ElectricEngine extends Engine {

    public ElectricEngine(int pk) {
        super(pk);
    }

    @Override
    public void inject(float amt) {

    }

    @Override
    public void print() {
        System.out.print("Electric");
        super.print();
    }
}
