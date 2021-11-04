package com.example.Fuels;

public class Gas implements Fuel{
    @Override
    public void print() {
        Fuel.super.print();
        System.out.println("Gas");
    }
}
