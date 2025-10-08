
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> B = new LinkedHashSet<>();
        B.add("My");
        B.add("name");
        B.add("is");
        B.add("Truong");
        System.out.println(B);

        B.remove("is");
        System.out.println(B);
    }
}
