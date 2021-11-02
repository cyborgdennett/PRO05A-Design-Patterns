package com.example.Parts.Storage;

import com.example.Parts.Part;

public class Battery implements Part{
    float maxCapacity = 0;
    float kwh = 0;
    
    public Battery(float maxCapacity){
        this.maxCapacity = maxCapacity;
    }
    public boolean fill(float kwh){
        if( kwh <= 0 ) return false;
        if( this.kwh + kwh > maxCapacity ) return false;
        this.kwh += kwh;
        return true;
    }
    public float get(float kwh){
        if( kwh <= 0 ) return 0;
        if( this.kwh - kwh >= 0 ) { this.kwh -= kwh; return kwh;}
        else{ float ret = this.kwh; this.kwh = 0; return ret;}
    }
    public void print(){
        System.out.println("Battery kwh: " + Float.toString(kwh) + ", maxCapacity: " + Float.toString(maxCapacity));
    }

}
