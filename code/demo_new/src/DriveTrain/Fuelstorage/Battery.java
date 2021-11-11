package DriveTrain.Fuelstorage;

public class Battery implements Fuelstorage{
    @Override
    public void fill() {
        System.out.println("Charging the battery!");
    }
}
