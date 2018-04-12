package Exercise16_SkiJumping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Round  {
    private List<Jumper> jumpers;
    private static int numberOfRound = 0;

    public Round (){
        jumpers = new ArrayList<>();
    }

    public void addJumper(String name) {
        jumpers.add(new Jumper(name));
    }

    public void startJumping() {
        numberOfRound++;
        for (Jumper jumper : jumpers) {
            jumper.addJump();
        }
    }

    public void printJumpingOrder() {
        sortByPoints();
        System.out.println("Jumping order: ");
        for (int i = 0; i < jumpers.size(); i++) {
            System.out.print((i+1) + ". ");
            jumpers.get(i).printJumperSummaryResult();
        }
    }

    public void printResultsOfRound(){
        System.out.println("Results of round " + numberOfRound);
        for (Jumper jumper : jumpers) {
            jumper.printJumperRoundResult(numberOfRound);
        }
    }

    public void printTournamentResults() {
        sortByPoints();
        sortInReverseOrder();

        System.out.println("Tournament results: ");
        System.out.println("Position    Name");
        for (int i = 0; i < jumpers.size(); i++) {
            System.out.print((i + 1) + "           ");
            jumpers.get(i).printJumperSummaryResult();
            System.out.print("            ");
            jumpers.get(i).printJumpsLengths();
            System.out.println();
        }
    }
    private void sortByPoints() {
        Collections.sort(jumpers);
    }

    private void sortInReverseOrder() {
        Collections.reverse(jumpers);
    }
}
