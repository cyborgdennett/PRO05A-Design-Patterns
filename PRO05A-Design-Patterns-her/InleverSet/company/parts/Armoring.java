package com.company.parts;

public abstract class Armoring implements Part {
    protected int price;
    public abstract void activate();
    public abstract void disable();

    public int price(){
        return price;
    }
}
