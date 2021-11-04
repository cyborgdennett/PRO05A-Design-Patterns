package com.example.Fuels;

public class Diesel implements Fuel {


    @Override
    public void print(){
        Fuel.super.print();
        System.out.println("Diesel");
    }

    @Override
    public String getName() {
        return "diesel";
    }
}
