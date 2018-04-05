package Exercise4_ThingSuitcaseContainer;

import java.util.ArrayList;

public class Container {
    private ArrayList<Suitcase> suitcases;
    private int weightLimit;

    public Container(int weightLimit) {
        suitcases = new ArrayList<>();
        this.weightLimit = weightLimit;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (summaryWeight() + suitcase.summaryWeight() <= weightLimit) {
            suitcases.add(suitcase);
        }
    }

    public int summaryWeight() {
        int sum = 0;
        for (int i = 0; i < suitcases.size(); i++) {
            sum += suitcases.get(i).summaryWeight();
        }
        return sum;
    }

    public String toString(){
        return suitcases.size() + " suitcases (" + summaryWeight() + " kg)";
    }

    public void printThings(){
        for (int i = 0; i < suitcases.size(); i++) {
            suitcases.get(i).printThings();
        }
    }
}
