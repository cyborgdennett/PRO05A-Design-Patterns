package com.example.Parts.Armoring;

public class GasResistantArmoring extends ArmorDecorator {
    private int maxGasDensityProtection = 0;

    public GasResistantArmoring(int maxGasDensityProtection) {
        this.maxGasDensityProtection = maxGasDensityProtection;
    }

    public void activate() {
        super.activate();
    }

    @Override
    public String getName() {
        return "GasResistantArmoring";
    }

    public void print() {
        super.print();
        System.out.println("Gas Resistant Armoring (" + this.maxGasDensityProtection + ").");
    }

    public int getMaxGasDensityProtection() {
        return this.maxGasDensityProtection;
    }

    public void setMaxGasDensityProtection(int maxGasDensityProtection) {
        this.maxGasDensityProtection = maxGasDensityProtection;
    }
}

