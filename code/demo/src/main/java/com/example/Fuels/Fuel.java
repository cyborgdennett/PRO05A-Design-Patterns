package com.example.Fuels;

public interface Fuel {
    public default void print(){
        System.out.print("Fuel of type: ");
    }
}
