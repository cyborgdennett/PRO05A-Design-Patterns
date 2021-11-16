package com.company.parts;

public class ElectronicArmoring extends ArmorDecorator {

    // Constructor
    public ElectronicArmoring(Armoring armoring) {

        super(armoring);
        this.price = 1500;
    }

    // Methods
    @Override
    public void activate() {
        super.activate();
        System.out.println("Jammers activated");
    }
    @Override
    public void disable(){
        super.disable();
        System.out.println("Jammers disabled");
    }
    @Override
    public String toString(){
        return super.toString() + "A Jammer, ";
    }

}
