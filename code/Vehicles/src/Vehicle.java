public class Vehicle {
    public RaceCar race = null;
    public CivilCar civil = null;
    public Tank tank = null;

    public Vehicle(RaceCar type){
        this.race = type;
    }
    public Vehicle(CivilCar type){
        this.civil = type;
        return type.getClass();
    }
    public Vehicle(Tank type){
        this.tank = type;
    }
}
