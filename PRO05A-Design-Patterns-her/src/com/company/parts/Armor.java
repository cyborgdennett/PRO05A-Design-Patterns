package com.company.parts;

public class Armor extends Armoring {

    public Armor() {this.price = 0;}
    public void activate() {
        System.out.println("Armor is activated");
    }
    public void disable() {
        System.out.println("Armor is deactivated");
    }
    @Override
    public String toString(){
        return "This vehicle is armored with: \n";
    }
}
