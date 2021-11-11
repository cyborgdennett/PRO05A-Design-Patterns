package Factory;

import Vehicle.Vehicle;

interface CarFactory{
    public Vehicle createVehicle(Order order);
    public Vehicle createDriveTrain(Order order);
}
