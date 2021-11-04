package com.example.Trade;

public abstract class Order {
    Owner to;
    Owner from;

    public abstract void buyOwnership(float budget);

    float price;
}
