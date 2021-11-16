package com.company.parts;

public class BulletproofArmoring extends ArmorDecorator {

    // Variables
    int maxCalibre;

    // Constructor
    public BulletproofArmoring(Armoring armoring, int maxCalibre) {
        super(armoring);
        this.maxCalibre = maxCalibre;
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
