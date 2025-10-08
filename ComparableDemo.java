import java.util.TreeSet;


public class ComparableDemo {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("Quang", 20));
        students.add(new Student("An", 18));
        students.add(new Student("Nam", 19));
        students.add(new Student("Hoa", 18));
        students.add(new Student("Hoa", 18));

        for (Student student: students) {
            System.out.println(student.toString());
        }
    }
}
