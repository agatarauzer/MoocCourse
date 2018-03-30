package exercise103_BirdwatchersDatebase;

import java.util.*;

public class BirdDatebase {
    private ArrayList<Birds> base;

    public BirdDatebase() {
        base = new ArrayList<>();
    }

    public void addBird(String birdName, String birdLatinName) {
        base.add(new Birds(birdName, birdLatinName));
    }

    public void printAllBirds() {
        for (Birds b : base) {
            System.out.println(b);
        }
    }

    public void addObservation(String birdsName) {
        boolean succeeded = false;
        for (int i = 0; i < base.size(); i++) {
            if (SearchingModul.searchingBirdName(base.get(i).getName(), birdsName)) {
                base.get(i).addNewObservation();
                succeeded = true;
            }
        }
        if (!succeeded) {
            System.out.println("Wrong name of bird! Try again. Press number");
        }
    }

    public void showBird(String birdsName) {
        boolean succeeded = false;
        for (int i = 0; i < base.size(); i++) {
            if (SearchingModul.searchingBirdName(base.get(i).getName(), birdsName)) {
                System.out.println(base.get(i));
                succeeded = true;
            }
        }
        if (!succeeded) {
            System.out.println("Wrong name of bird! Try again. Press number");
        }
    }
}












