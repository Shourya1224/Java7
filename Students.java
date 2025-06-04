

class Student implements Comparable<Student> {
    int rollno;
    String name;
    int age;

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }


    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rollno, other.rollno);
    }

   
    @Override
    public String toString() {
        return rollno + " " + name + " " + age;
    }
}
