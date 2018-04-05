package Exercise4_ThingSuitcaseContainer;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int weightLimit;

    public Suitcase(int weightLimit) {
        things = new ArrayList<>();
        this.weightLimit = weightLimit;
    }

    public void addThing(Thing thing) {
        if (summaryWeight() + thing.getWeight() <= weightLimit)
            things.add(thing);
    }

    public int summaryWeight() {
        int sum = 0;
        for (int i = 0; i < things.size(); i++) {
            sum += things.get(i).getWeight();
        }
        return sum;
    }

    public String toString() {
        if (things.size() == 0) {
            return "empty (0 kg)";
        }
        else if (things.size() == 1) {
            return "1 thing (" + things.size() + " kg) ";
        }
        else {
            return things.size() + " things (" + summaryWeight() + " kg) ";
        }
    }

    public void printThings() {
        for (Thing t: things) {
            System.out.println(t);
        }
    }

    public Thing heaviestThing() {
        Thing heaviest = things.get(0);
        if (things.size() == 0) {
            return null;
        }
        for (int i = 1; i < things.size(); i++) {
            if (things.get(i).getWeight() > heaviest.getWeight()) {
                heaviest = things.get(i);
            }
        }
        return heaviest;
    }
}


