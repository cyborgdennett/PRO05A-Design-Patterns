package com.example.Parts.Engines;

import com.example.Fuels.Fuel;

public class FuelEngine extends Engine {
    private Fuel fuel = null;

    public FuelEngine(Fuel fuel, int pk) {
        super(pk);
        this.fuel = fuel;
    }

    @Override
    public void inject(Fuel fuel, float amt) throws UnsupportedOperationException{
        if( this.fuel != fuel ) {
            throw new ClassCastException("Wrong fuel for engine. Received: " + fuel.toString() + ", Required: " + this.fuel.toString());
        }
        System.out.println("Fuel injected");
    }

    @Override
    public void print() {
        System.out.print(fuel.toString());
        super.print();
    }
    public String getFuel(){
        return fuel.getClass().getName();
    }
}
