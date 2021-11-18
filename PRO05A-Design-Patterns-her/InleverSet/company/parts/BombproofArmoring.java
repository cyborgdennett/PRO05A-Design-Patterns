package com.company.parts;

public class BombproofArmoring extends ArmorDecorator {

    // Variables
    private final int maxExplosiveForce;

    // Constructor
    public BombproofArmoring(Armoring armoring, int maxExplosiveForce) {
        super(armoring);
        this.maxExplosiveForce = maxExplosiveForce;
        this.price = maxExplosiveForce * 10;
    }

    // Methods
    @Override
    public void activate() {
        super.activate();
        System.out.println("Explosive protection enabled");
    }
    @Override
    public void disable(){
        super.disable();
        System.out.println("Explosive protection disabled");
    }
    @Override
    public String toString(){
        return super.toString() + "Bombpoofing, ";
    }

}
