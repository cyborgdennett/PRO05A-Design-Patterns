package Factory;

import Vehicle.Vehicle;

public interface Order {
    Vehicle getVehicle(int integer);
    void giveVehicle(Vehicle vehicle);
}
