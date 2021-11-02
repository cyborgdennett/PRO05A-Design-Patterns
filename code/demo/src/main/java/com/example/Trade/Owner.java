package com.example.Trade;

import com.example.Vehicles.Vehicle;
import java.util.List;

public interface Owner {
    String name = null;
    List<Vehicle> vehicles = null;
    float money = 0;

    default void buy(){
        
    }
    default void sell(){

    }
    
    
}
