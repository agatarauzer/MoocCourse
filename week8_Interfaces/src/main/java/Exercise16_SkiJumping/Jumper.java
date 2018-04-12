package Exercise16_SkiJumping;

import java.util.ArrayList;
import java.util.List;

public class Jumper implements Comparable<Jumper> {
    private String name;
    private List<Jump> jumps;

    public Jumper(String name) {
        this.name = name;
        jumps = new ArrayList<>();
    }

    public void addJump() {
        jumps.add(new Jump());
    }

    public int sumPoints() {
        int sum = 0;
        for (Jump jump : jumps) {
            sum += jump.jumpPoints();
        }
        return sum;
    }

    public void printJumperRoundResult(int roundNumber) {
        System.out.println(name + "\n  " + jumps.get(roundNumber - 1));
    }

    public void printJumperSummaryResult() {
        System.out.println(name + " (" + sumPoints() + " points)");
    }

    public void printJumpsLengths() {
        System.out.print("jump lengths: ");
        for (int i = 0; i < jumps.size(); i++) {
            if (i < jumps.size() - 1) {
                System.out.print(jumps.get(i).getLength() + " m, ");
            }
            else {
                System.out.print(jumps.get(i).getLength() + " m");
            }
        }
    }

    public int compareTo(Jumper jumper) {
        return this.sumPoints() - jumper.sumPoints();
    }
}
