package Exercise16_SkiJumping;


import java.util.Scanner;

public class TournamentSimulation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Round tournament = new Round();

        System.out.println("Kumpula ski jumping week");
        System.out.println("\nWrite the names of the participants one at a time; an empty string brings you to the jumping phase. ");
        System.out.print("  Participant name: ");
        String name = scanner.nextLine();

        while (!name.isEmpty()) {
             tournament.addJumper(name);
             System.out.print("  Participant name: ");
             name = scanner.nextLine();
        }

        System.out.println("\nThe tournament begins!");
        System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
        String command = scanner.nextLine();

        int numberOfRound = 1;

        while (command.equals("jump")) {
            System.out.println("\nRound " + numberOfRound);
            tournament.printJumpingOrder();
            tournament.startJumping();
            System.out.println();
            tournament.printResultsOfRound();
            numberOfRound++;
            System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
            command = scanner.nextLine();
        }

        System.out.println("\nThanks!");
        tournament.printTournamentResults();
    }
}
