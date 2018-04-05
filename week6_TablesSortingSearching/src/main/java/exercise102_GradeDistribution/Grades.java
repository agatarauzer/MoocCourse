package exercise102_GradeDistribution;

import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> examGrades;

    public Grades() {
        examGrades = new ArrayList<>();
    }

    public void addNewGrade(int score) {
        examGrades.add(scoreToGrade(score));
    }

    public static int scoreToGrade(int score) {
        int grade = 0;

        if (score >= 0 && score < 30) {
            grade = 0;
        }
        else if (score >= 30 && score < 35) {
            grade = 1;
        }
        else if (score >= 35 && score < 40) {
            grade = 2;
        }
        else if (score >= 40 && score < 45) {
            grade = 3;
        }
        else if (score >= 45 && score < 50) {
            grade = 4;
        }
        else if (score >= 50 && score <= 60) {
            grade = 5;
        }
        return grade;
    }

    public void printGrades() {
        int[] scale = {5, 4, 3, 2, 1, 0};

        for (int j = 0; j < scale.length; j++) {
            System.out.print(scale[j] + ":");
            for (int i = 0; i < examGrades.size(); i++) {
                if (scale[j] == examGrades.get(i))
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public double countAcceptancePercentage(){
        int accepted = 0;

        for(int i = 0; i < examGrades.size(); i++) {
            if (examGrades.get(i) > 0)
                accepted++;
        }
        return ((double) accepted / examGrades.size()) * 100;
    }
}



