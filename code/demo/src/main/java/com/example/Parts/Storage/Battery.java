package com.example.Parts.Storage;

import com.example.Parts.Part;

public class Battery implements Part{
    protected float maxCapacity = 0;
    protected float amt = 0;
    
    public Battery(float maxCapacity){
        this.maxCapacity = maxCapacity;
    }
    public boolean fill(float amt){
        if( amt <= 0 ) return false;
        if( this.amt + amt > maxCapacity ) return false;
        this.amt += amt;
        return true;
    }
    public float get(float amt){
        if( amt <= 0 ) return 0;
        if( this.amt - amt >= 0 ) { this.amt -= amt; return amt;}
        else{ float ret = this.amt; this.amt = 0; return ret;}
    }
    public void print(){
        System.out.println("Battery kwh: " + Float.toString(amt) + ", maxCapacity: " + Float.toString(maxCapacity));
    }
    
}
