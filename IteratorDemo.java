import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<>();
        A.add(0);
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        Iterator<Integer> it = A.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        /*for (Integer x : A) {
            System.out.print(x + " ");
        }*/
    }
}
