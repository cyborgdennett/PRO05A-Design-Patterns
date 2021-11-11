package Factory;

import Vehicle.Vehicle;

public interface Order {
    public Vehicle getVehicle(int integer);
    public void giveVehicle(Vehicle vehicle);
}
