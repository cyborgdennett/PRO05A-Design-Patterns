package com.company.parts;

public class BombproofArmoring extends ArmorDecorator {

    // Variables
    int maxExplosiveForce;

    // Constructor
    public BombproofArmoring(Armoring armoring, int maxExplosiveForce) {
        super(armoring);
        this.maxExplosiveForce = maxExplosiveForce;
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
