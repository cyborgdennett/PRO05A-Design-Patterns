package com.example.Trade;

public class Customer extends Owner{
    public Customer(String nameOwner, float budget, Order vehicleOrder){
        name = nameOwner;
        money = budget;
        order = vehicleOrder;
    }

    @Override
    public void buy() {
        order.buyOwnership(15000);
    }

    @Override
    public void sell() {
        order.sellOwnership(8000);
    }
}
