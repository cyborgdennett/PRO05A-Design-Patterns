package com.company.parts;

public class BulletproofArmoring extends ArmorDecorator {
    // Variables
    private final int maxCalibre;

    // Constructor
    public BulletproofArmoring(Armoring armoring, int maxCalibre) {
        super(armoring);
        this.maxCalibre = maxCalibre;
        this.price = maxCalibre * 50;
    }

    // Methods
    @Override
    public void activate() {
        super.activate();
        System.out.println("Closing windows to enable Bulletproof armor");
    }
    @Override
    public void disable(){
        super.disable();
        System.out.println("Bulletproof armor is disabled. Windows can be opened again.");
    }
    @Override
    public String toString(){
        return super.toString() + "Bulletproofing untill a calibre of: " + Integer.toString(this.maxCalibre) + ", ";
    }
}
