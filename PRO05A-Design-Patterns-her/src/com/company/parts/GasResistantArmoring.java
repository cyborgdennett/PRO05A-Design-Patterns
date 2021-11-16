package com.company.parts;

public class GasResistantArmoring extends ArmorDecorator {

    // Constructor
    public GasResistantArmoring(Armoring armoring) {
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
