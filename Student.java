import java.util.Objects;

public class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student other = (Student) obj;
        return this.age == other.age && this.name.equals(other.name);
    }*/

    @Override
    public int compareTo(Student o) {
        int comp = Integer.compare(this.age, o.age);
        if (comp == 0) {
            return this.name.compareTo(o.name);
        }

        return comp;
    }

    @Override
    public String toString() {
        return this.name + " is " + this.age;
    }
}