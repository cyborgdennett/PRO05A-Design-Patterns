package com.example.Parts.Engines;

import java.util.EmptyStackException;

import com.example.Fuels.Fuel;
import com.example.Parts.Part;

public abstract class Engine implements Part {
    private int pk;
    private float minAmount;
    
    public Engine(int pk){
        this.pk = pk;
    }

    public void inject(float amt){ throw new EmptyStackException();}
    public void inject(Fuel fuel, float amt){ throw new EmptyStackException();}

    @Override
    public void print(){
        System.out.println("Engine with " + Integer.toString(pk) + "pk.");
    }
}
