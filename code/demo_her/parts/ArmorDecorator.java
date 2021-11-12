package com.company.parts;

public abstract class ArmorDecorator extends Armoring {

    // Variables
    Armoring armoring;

    // Constructor
    public ArmorDecorator(Armoring armoring) {
        this.armoring = armoring;
    }

    // Methods
    @Override
    public void activate() {

    }
}
