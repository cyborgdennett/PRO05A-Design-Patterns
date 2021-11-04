package com.example.Trade;
import com.example.Factories.CarFactory.*;

public class FactoryOrder extends Order{
    public FactoryOrder(Dealer dealer, AbstractCarFactory factory, float minPrice){
        to = dealer;
//        from = factory;
        price = minPrice;
    }

    @Override
    public void buyOwnership(float budget){
        System.out.print("Auto is niet meer in het bezit van de factory ");
        System.out.print(from.name);
        System.out.println('.');
        System.out.print("Auto is nu in het bezit van dealer ");
        System.out.print(to.name);
        System.out.println('.');
        System.out.print("Het bedrag van: ");
        System.out.print(budget);
        System.out.println(" is betaald aan de factory");
    }

}
