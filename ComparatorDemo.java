import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        Comparator<Student> sortByAge = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.age, o2.age);
            }
        };

        Comparator<Student> sortByName = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        TreeSet<Student> students = new TreeSet<>(sortByAge);
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
