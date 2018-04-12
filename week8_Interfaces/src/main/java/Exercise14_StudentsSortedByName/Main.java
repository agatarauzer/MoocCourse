package Exercise14_StudentsSortedByName;

import Exercise13_RichFirstPoorLast.Person;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ala"));
        students.add(new Student("Asia"));
        students.add(new Student("Aleksandra"));
        students.add(new Student("Andrzej"));
        students.add(new Student("Olgierd"));
        students.add(new Student("Ksawery"));

        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
    }
}
