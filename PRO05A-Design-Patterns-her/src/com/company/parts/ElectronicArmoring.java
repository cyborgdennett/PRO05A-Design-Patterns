package com.company.parts;

public class ElectronicArmoring extends ArmorDecorator {

    // Constructor
    public ElectronicArmoring(Armoring armoring) {
        super(armoring);
    }

    // Methods
    @Override
    public void activate() {
        super.activate();
    }

    @Override
    public int price() {
        return 0;
    }
}
