package com.example.Parts.Rims;

public class DefaultRim implements Rim {
    @Override
    public String getName() {
        return "DefuaultRim";
    }

    @Override
    public void print() {
        System.out.println("This is a default rim!");
        
    }
    
}
