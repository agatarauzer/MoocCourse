package exercise94_PhoneBook;

import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> list = new ArrayList<>();

    public void add(String name, String number){
        Person addedPerson = new Person(name, number);
        list.add(addedPerson);
    }

    public void printAll(){
        for(Person p: list){
            System.out.println(p);
        }
    }

    public String searchNumber(String name){
        String foundedNumber = "";

        for(Person p: list){
            if(p.getName().contains(name))
                foundedNumber = p.getNumber();
        }

        if(foundedNumber.equals(""))
            foundedNumber = "number not known";

        return foundedNumber;
    }
}
