package Exercise13_RichFirstPoorLast;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Kuba", 2000));
        persons.add(new Person("Basia", 7000));
        persons.add(new Person("Rafał", 4500));
        persons.add(new Person("Dorota", 1500));

        System.out.println(persons);
        Collections.sort(persons);
        System.out.println(persons);
    }
}
