package collections;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        List <Integer> list = new ArrayList<>();
        vector.add(23);
        vector.add(55);
        vector.add(11);
        vector.add(34);
        Collections.sort(vector);
        System.out.println(vector.getFirst());
        Collections.sort(vector, Collections.reverseOrder());
        System.out.println(vector);
    }
}
