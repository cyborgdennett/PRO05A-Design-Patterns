public class App {
    public App() {
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Armoring bombproofArmoring = new BombproofArmoring(500);
        bombproofArmoring.print();
        vehicle.addPart(bombproofArmoring);
        vehicle.print();
    }
}