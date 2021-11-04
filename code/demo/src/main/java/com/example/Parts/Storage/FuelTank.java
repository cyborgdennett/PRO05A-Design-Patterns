package com.example.Parts.Storage;

import com.example.Fuels.Fuel;

public class FuelTank extends Battery{
    private Fuel fuel = null;

    public FuelTank(Fuel fuel, float maxCapacity){
        super(maxCapacity);
        this.fuel = fuel;
    }
    @Override
    public boolean fill(float amt){System.out.println("Trying to fill FuelTank without specific Fuel..."); return false;}

    public boolean fill(Fuel fuel, float amt){
        if( this.fuel != fuel && this.fuel != null ) return false;
        if( this.amt + amt > maxCapacity ) return false;
        if( this.fuel == null ) this.fuel = fuel;
        this.amt += amt;
        return true;
    }
    @Override
    public void print(){
        System.out.println("FuelTank with:" + fuel.toString() + " full: " + amt + "/" + maxCapacity);
    }
    public Fuel getFuel(){
        return fuel;
    }
}
