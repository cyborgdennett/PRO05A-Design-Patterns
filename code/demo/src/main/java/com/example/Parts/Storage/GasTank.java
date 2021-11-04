package com.example.Parts.Storage;

import com.example.Fuels.Fuel;

public class GasTank extends FuelStorage{
    private Fuel fuel = null;
    private float amt;

    public GasTank(Fuel fuel, float maxCapacity){
        super(maxCapacity);
        this.fuel = fuel;
    }
    @Override
    public boolean fill(float amt){System.out.println("Trying to fill FuelTank without specific Fuel..."); return false;}

    @Override
    public String getName() {
        return "GasTank";
    }

    public boolean fill(Fuel fuel, float amt){
        if( this.fuel != fuel && this.fuel != null ) return false;
        if( this.amt + amt > maxCapacity ) return false;
        if( this.fuel == null ) this.fuel = fuel;
        this.amt += amt;
        return true;
    }
    @Override
    public void print(){
        System.out.println("GasTank with:" + fuel.toString() + " full: " + amt + "/" + maxCapacity);
    }
    public float get(float amt){
        if( amt <= 0 ) return 0;
        if( this.amt - amt >= 0 ) { this.amt -= amt; return amt;}
        else{ float ret = this.amt; this.amt = 0; return ret;}
    }

    public Fuel getFuel(){
        return fuel;
    }
}