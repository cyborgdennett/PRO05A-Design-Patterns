package DriveTrain.Engine;

public class CombustionEngine implements Engine{
    @Override
    public void accelerate() {
        System.out.println("Accelerating!");
    }

    @Override
    public void shiftUp() {
        System.out.println("Shifting up a gear!");
    }

    @Override
    public void shiftDwwn() {
        System.out.println("Shifting down a gear!");
    }
}
