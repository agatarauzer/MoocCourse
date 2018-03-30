package exercise103_BirdwatchersDatebase;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BirdDatebase myBirds = new BirdDatebase();

        printMenu();

        int chosenOperation = scanner.nextInt();
        while (chosenOperation != 5) {
            if (chosenOperation == 1 ) {
                scanner.nextLine();
                System.out.print("Name: ");
                String birdName = scanner.nextLine();
                System.out.print("Latin name: ");
                String birdLatinName = scanner.nextLine();
                myBirds.addBird(birdName, birdLatinName);
            }
            else if (chosenOperation == 2) {
                scanner.nextLine();
                System.out.print("What was observed? Enter name: ");
                String searchedName = scanner.nextLine();
                myBirds.addObservation(searchedName);
            }
            else if (chosenOperation == 3) {
                myBirds.printAllBirds();
            }
            else if (chosenOperation == 4) {
                scanner.nextLine();
                System.out.print("Which bird print? Enter name: ");
                String searchedName = scanner.nextLine();
                myBirds.showBird(searchedName);
            }
            else {
                System.out.println("Wrong number. Try again.");
            }

            System.out.print("Number: ");
            chosenOperation = scanner.nextInt();
        }
    }

    private static void printMenu(){
        System.out.println("Choose operation: ");
        System.out.println("1. Adding new bird. ");
        System.out.println("2. Adding observation of bird.");
        System.out.println("3. Printing statistics of birds in base");
        System.out.println("4. Showing one bird. ");
        System.out.println("5. Quit. ");
        System.out.print("Number: ");
    }
}
