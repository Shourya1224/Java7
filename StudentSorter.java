import java.util.*;

class Student {
    String name;
    int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class StudentSorter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 22),
            new Student("Bob", 20),
            new Student("Charlie", 22),
            new Student("David", 20)
        );

       
        students.sort(Comparator.comparingInt(Student::getAge)
                                .thenComparing(Student::getName));

        students.forEach(System.out::println);
    }
}
