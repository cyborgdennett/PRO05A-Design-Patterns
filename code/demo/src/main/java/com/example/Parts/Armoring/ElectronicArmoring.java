package com.example.Parts.Armoring;

public class ElectronicArmoring extends ArmorDecorator {
    private int maxPowerProtection = 0;

    public ElectronicArmoring(int maxPowerProtection) {
        this.maxPowerProtection = maxPowerProtection;
    }

    public void activate() {
        super.activate();
    }

    @Override
    public String getName() {
        return "ElectronicArmoring";
    }

    public void print() {
        super.print();
        System.out.println("Electronic Armor(" + this.maxPowerProtection + ").");
    }

    public int getMaxPowerProtection() {
        return this.maxPowerProtection;
    }

    public void setMaxPowerProtection(int maxPowerProtection) {
        this.maxPowerProtection = maxPowerProtection;
    }
}
