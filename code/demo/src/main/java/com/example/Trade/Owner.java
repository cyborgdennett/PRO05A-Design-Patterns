package com.example.Trade;

import com.example.Vehicles.Vehicle;
import java.util.List;

public abstract class Owner {
    String name;
    List<Vehicle> vehicles;
    float money;
    Order order;

    abstract void buy();
    abstract void sell();
    
    
}
