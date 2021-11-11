package Owner;

import Factory.Order;
import Vehicle.Vehicle;

public abstract class Owner implements Order {
    public Vehicle[] vehicles;
    public abstract Vehicle sellOrder(Vehicle vehicle);
    public abstract void buyOrder(Vehicle vehicle);

}
