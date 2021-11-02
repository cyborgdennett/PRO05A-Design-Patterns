import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Vehicle {
    private List<Part> parts = new ArrayList();
    private Armoring[] armorings;

    public Vehicle() {
    }

    public int rangeLeft() {
        return 100;
    }

    public void fill(int amountOfFuel) {
        System.out.println("Added fuel");
    }

    public void drive() {
        System.out.println("DRIVING");
    }

    public void removePart(Part part) {
        this.parts.remove(part);
    }

    public void addPart(Part part) {
        this.parts.add(part);
    }

    public void print() {
        Iterator var1 = this.parts.iterator();

        while(var1.hasNext()) {
            Part part = (Part)var1.next();
            part.print();
        }

    }
}
