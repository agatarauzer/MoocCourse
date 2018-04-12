package exercise94_PhoneBook;

import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> list = new ArrayList<>();

    public void add(String name, String number) {
        Person addedPerson = new Person(name, number);
        list.add(addedPerson);
    }

    public void printAll(){
        for (Person person: list) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        String foundedNumber = "";
        for (Person person: list) {
            if (person.getName().contains(name)) {
                foundedNumber = person.getNumber();
            }
        }
        if (foundedNumber.equals("")) {
            foundedNumber = "number not known";
        }
        return foundedNumber;
    }
}
