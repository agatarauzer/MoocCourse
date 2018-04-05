package exercise103_BirdwatchersDatebase;

public class Birds {
    private String name;
    private String latinName;
    private int numberOfObservations;

    public Birds(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.numberOfObservations = 0;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name + " (" + this.latinName + "): " + numberOfObservations + " observations";
    }

    public void addNewObservation() {
        numberOfObservations++;
    }
}




