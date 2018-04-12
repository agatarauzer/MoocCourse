package Exercise14_StudentsSortedByName;

public class Student implements Comparable<Student> {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student student) {
        return name.compareToIgnoreCase(student.name);
    }
}
