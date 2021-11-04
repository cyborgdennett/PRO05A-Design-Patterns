package com.example.Parts.DriveTrain;

import javax.crypto.ExemptionMechanismException;

import com.example.Fuels.Fuel;
import com.example.Parts.Engines.Engine;

public interface DriveTrain{
    default public void drive() throws ExemptionMechanismException {
        
    }
    default public void fill(float amt)throws ExemptionMechanismException{

    }
    default public void fill(Fuel fuel, float amt)throws ExemptionMechanismException{

    }
    public void print();

    public String getName();
}