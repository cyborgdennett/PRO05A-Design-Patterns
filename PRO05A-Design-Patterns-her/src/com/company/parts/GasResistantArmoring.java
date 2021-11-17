package com.company.parts;

public class GasResistantArmoring extends ArmorDecorator {

    // Constructor
    public GasResistantArmoring(Armoring armoring) {
        super(armoring);
        this.price = 800;
    }

    // Methods
    @Override
    public void activate() {
        super.activate();
        System.out.println("Gas armor enabled, you cannot open windows.");
    }
    @Override
    public void disable(){
        super.disable();
        System.out.println("Gas armor disabled, you can now open windows.");
    }
    @Override
    public String toString(){
        return super.toString() + "Gas Resistance, ";
    }

}
