import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
      
        int ageComparison = Integer.compare(s2.age, s1.age);
        if (ageComparison != 0) {
            return ageComparison;
        }

        return s2.name.compareTo(s1.name);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 22),
            new Student("Bob", 25),
            new Student("Charlie", 22),
            new Student("David", 25)
        );

        Collections.sort(students, new StudentComparator());

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
`
