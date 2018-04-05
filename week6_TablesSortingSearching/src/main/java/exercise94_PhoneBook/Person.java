package exercise94_PhoneBook;

public class Person {
    private String name;
    private String number;

    public Person(String name, String number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void changeNumber(String newNumber){
        number = newNumber;
    }

    public String toString(){
        return name + "  number: " + number;
    }
}
