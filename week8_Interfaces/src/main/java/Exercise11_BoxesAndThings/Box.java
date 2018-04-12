package Exercise11_BoxesAndThings;

import java.util.ArrayList;

public class Box implements ToBeStored {
    private double maximumWeight;
    private ArrayList<ToBeStored> things;

    public Box(double maximumWeight) {
        this.maximumWeight = maximumWeight;
        things = new ArrayList<>();
    }

    public void add(ToBeStored thing) {
        if (weight() + thing.weight() <= maximumWeight) {
            things.add(thing);
        }
    }

    public double weight() {
        double boxWeight = 0;
        for (ToBeStored thing: things) {
            boxWeight += thing.weight();
        }
        return boxWeight;
    }

    public String toString() {
        return "Box: " + things.size() + " things, total weight " + weight() + " kg";
    }
}
