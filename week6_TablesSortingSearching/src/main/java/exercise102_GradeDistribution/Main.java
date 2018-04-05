package exercise102_GradeDistribution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Grades myGrades = new Grades();

        System.out.println("Type exam scores (in range 0-60), -1 completes:");
        int score = scanner.nextInt();

        while (score != -1) {
            if (score >= 0 && score <= 60) {
                myGrades.addNewGrade(score);
            }
            else {
                System.out.println("You have entered wrong number. Try again");
            }
            score = scanner.nextInt();
        }

        System.out.println("Grade distribution:");
        myGrades.printGrades();
        System.out.println("Acceptance percentage: " + myGrades.countAcceptancePercentage() + " %");
    }
}
