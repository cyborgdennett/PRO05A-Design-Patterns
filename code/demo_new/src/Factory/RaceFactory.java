package Factory;

import Owner.Owner;
import Vehicle.Vehicle;

public class RaceFactory extends Owner {
    @Override
    public Vehicle getVehicle(int integer) {
        return null;
    }

    @Override
    public void giveVehicle(Vehicle vehicle) {

    }

    @Override
    public Vehicle sellOrder(Vehicle vehicle) {
        return null;
    }

    @Override
    public void buyOrder(Vehicle vehicle) {

    }
}
