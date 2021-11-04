package com.example.Parts.Armoring;

public class BombproofArmoring extends ArmorDecorator {
    private int maxExplosiveForce = 0;

    public BombproofArmoring(int maxExplosiveForce) {
        this.maxExplosiveForce = maxExplosiveForce;
    }

    public void activate() {
    }

    @Override
    public String getName() {
        return "BombproofArmoring";
    }

    public void print() {
        super.print();
        System.out.println("BombproofArmoring (" + this.maxExplosiveForce + ").");
    }

    public void setMaxExplosiveForce(int maxExplosiveForce) {
        this.maxExplosiveForce = maxExplosiveForce;
    }

    public int getMaxExplosiveForce() {
        return this.maxExplosiveForce;
    }
}
