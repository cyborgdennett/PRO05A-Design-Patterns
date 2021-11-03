package com.example.Parts.Storage;

import com.example.Fuels.Fuel;
import com.example.Parts.Part;

public class FuelTank implements Part{
    private Fuel fuel = null;
    private float maxCapacity = 0;
    private float amt = 0;
    public FuelTank(Fuel fuel, float maxCapacity){
        this.fuel = fuel;
        this.maxCapacity = maxCapacity;
    }

    public boolean fill(Fuel fuel, float amt){
        if( this.fuel != fuel && this.fuel != null ) return false;
        if( this.amt + amt > maxCapacity ) return false;
        if( this.fuel == null ) this.fuel = fuel;
        this.amt += amt;
        return true;
    }
    public float get(float amt){
        if( amt <= 0 ) return 0;
        if( this.amt - amt >= 0 ) { this.amt -= amt; return amt;}
        else{ float ret = this.amt; this.amt = 0; this.fuel = null; return ret;}
    }
    public void print(){
        System.out.println("FuelTank with:" + fuel.toString() + " full: " + amt + "/" + maxCapacity);
    }
    public Fuel getFuel(){
        return fuel;
    }
}
