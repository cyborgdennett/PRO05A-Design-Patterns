package com.example.Trade;

public class Dealer extends Owner {
    public Dealer(Order factoryOrder){
        order = factoryOrder;
    }
    @Override
    void buy() {
        System.out.println("2e hands auto nu verkregen");
    }

    @Override
    void sell() {
        System.out.println("Auto niet op vooraad. Bestel een nieuwe van de factory");
        order.buyOwnership(10000);
    }
}
