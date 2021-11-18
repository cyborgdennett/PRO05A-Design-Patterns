package com.company.parts;

public abstract class ArmorDecorator extends Armoring {

    // Variables
    protected Armoring armoring;

    // Constructor
    public ArmorDecorator(Armoring armoring) {
        this.armoring = armoring;
    }

    // Methods
    public void activate() {
        armoring.activate();
    }
    public void disable(){
        armoring.activate();
    }
    @Override
    public int price(){
        return super.price() + price;
    }

}
