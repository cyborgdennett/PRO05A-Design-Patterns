package com.example.Parts.Engines;

import com.example.Fuels.Fuel;
import com.example.Parts.Part;

public abstract class Engine implements Part {
    protected int pk;
    
    public Engine(int pk){
        this.pk = pk;
    }

    public void inject(float amt) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }
    public void inject(Fuel fuel, float amt) throws UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

    @Override
    public void print(){
        System.out.println("Engine with " + Integer.toString(pk) + "pk.");
    }
}
