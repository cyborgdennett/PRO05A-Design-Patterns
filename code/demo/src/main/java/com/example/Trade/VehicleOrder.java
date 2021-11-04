package com.example.Trade;

public class VehicleOrder extends Order{
    public VehicleOrder(Dealer dealer, Owner customer, float minPrice){
        from = dealer;
        to = customer;
        price = minPrice;
    }

    @Override
    public void buyOwnership(float budget){
        System.out.print("Auto is niet meer in het bezit van de dealer ");
        System.out.print(from.name);
        System.out.println('.');
        System.out.print("Auto is nu in het bezit van eigenaar ");
        System.out.print(to.name);
        System.out.println('.');
        System.out.print("Het bedrag van: ");
        System.out.print(budget);
        System.out.println(" is betaald aan de dealer");
    }

    public void sellOwnership(float budget) {
        System.out.print("Auto is niet meer in het bezit van de eigenaar ");
        System.out.print(to.name);
        System.out.println('.');
        System.out.print("Auto is nu in het bezit van dealer ");
        System.out.print(from.name);
        System.out.println('.');
        System.out.print("Het bedrag van: ");
        System.out.print(budget);
        System.out.println(" is betaald aan de eigenaar");

        from.buy();
    }
}
