import java.util.*;

class Student2 {
    String name;
    int rollNumber;

  
    public Student2(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return name + " (Roll No: " + rollNumber + ")";
    }
}

public class Student2Sorter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 102),
            new Student("Bob", 105),
            new Student("Charlie", 101),
            new Student("David", 104)
        );

    
        students.sort((s3, s4) -> Integer.compare(s3.getRollNumber(), s4.getRollNumber()));

        students.forEach(System.out::println);
    }
}
