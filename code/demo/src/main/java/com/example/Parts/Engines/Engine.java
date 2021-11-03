package com.example.Parts.Engines;

import java.io.InvalidClassException;

import com.example.Fuels.Fuel;
import com.example.Parts.Part;

public class Engine implements Part {
    private int pk;
    
    public Engine(int pk){
        this.pk = pk;
    }

    public void inject(float amt) throws UnsupportedOperationException{}
    public void inject(Fuel fuel, float amt) throws UnsupportedOperationException{}

    @Override
    public void print(){
        System.out.println("Engine with " + Integer.toString(pk) + "pk.");
    }
}
