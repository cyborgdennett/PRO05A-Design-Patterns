package com.example.Parts.Armoring;

public class BulletproofArmoring extends ArmorDecorator {
    int maxBulletProtection = 0;

    public BulletproofArmoring(int maxBulletProtection) {
        this.maxBulletProtection = maxBulletProtection;
    }

    public void activate() {
        super.activate();
    }

    @Override
    public String getName() {
        return "BulletproofArmoring";
    }

    public void print() {
        super.print();
        System.out.println("Bulletproof Armoring (" + this.maxBulletProtection + ").");
    }

    public int getMaxBulletProtection() {
        return this.maxBulletProtection;
    }

    public void setMaxBulletProtection(int maxBulletProtection) {
        this.maxBulletProtection = maxBulletProtection;
    }
}
