import javax.sound.midi.Soundbank;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<>();
        A.add(3);
        A.add(4);
        A.add(2);
        A.add(-3);
        A.add(null);
        System.out.println(A);

        A.remove(2);
        A.remove(null);
        System.out.println(A);

        /*HashSet<Student> students = new HashSet<>();
        students.add(new Student("Nga", 20));
        students.add(new Student("Nam", 21));
        students.add(new Student("Nga", 20));
        for (Student student : students) {
            System.out.println(student.toString());
        }*/
    }
}
