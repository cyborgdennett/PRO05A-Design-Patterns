package DriveTrain;

import DriveTrain.Engine.Engine;
import DriveTrain.Fuelstorage.Fuelstorage;

public class HybridDriveTrain extends DriveTrain{
    private Fuelstorage fuelstorage;
    private Engine engine;
    private DriveTrain otherDriveTrain;
    public void fill(){
        System.out.println("Filling up!");
    }
}
