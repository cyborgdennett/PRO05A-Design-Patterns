package com.example.Parts.Rims;

public class ChromeRim implements Rim {
    @Override
    public String getName() {
        return "ChromeRim";
    }

    @Override
    public void print() {
        System.out.println("This is a chrome rim!");
        
    }
    
}
