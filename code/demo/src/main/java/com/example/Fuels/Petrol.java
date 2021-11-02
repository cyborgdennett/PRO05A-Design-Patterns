package com.example.Fuels;

public class Petrol implements Fuel{
    @Override
    public void print(){
        Fuel.super.print();
        System.out.println("Petrol");
    }
}
