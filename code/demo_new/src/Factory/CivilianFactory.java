package Factory;

import Owner.Owner;
import Vehicle.Vehicle;

public class CivilianFactory extends Owner implements CarFactory{
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

    @Override
    public Vehicle createVehicle(Order order) {
        return null;
    }

    @Override
    public Vehicle createDriveTrain(Order order) {
        return null;
    }
}
