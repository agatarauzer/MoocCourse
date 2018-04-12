package Exercise13_RichFirstPoorLast;

public class Person implements Comparable<Person> {
    private String name;
    private int salary;

    public Person() {
        this.name = "no name";
        this.salary = 0;
    }

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int compareTo(Person person) {
        if (person.salary < salary) {
            return -1;
        }
        else if (salary == person.salary) {
            return 0;
        }
        else {
            return 1;
        }
    }

    public String toString() {
        return "name: " + name + " (salary: " + salary + ")";
    }







}
