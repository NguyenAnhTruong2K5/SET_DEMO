import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> C = new TreeSet<>();
        C.add(0);
        C.add(3);
        C.add(2);
        C.add(-1);
        System.out.println(C);

        TreeSet<String> D = new TreeSet<>();
        D.add("Chicken");
        D.add("Apple");
        D.add("Fish");
        System.out.println(D);
    }
}
