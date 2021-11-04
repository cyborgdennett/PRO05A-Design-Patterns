package com.example.Parts.Storage;

import com.example.Parts.Part;

public abstract class FuelStorage implements Part {
    float maxCapacity;

    public FuelStorage(float maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public abstract boolean fill(float amt);
    public abstract String getName();
    public abstract void print();

}
