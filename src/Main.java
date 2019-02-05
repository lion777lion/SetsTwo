import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(10);
        Set<Integer> setUnion = new HashSet<>(set1);
        setUnion.addAll(set2);
        System.out.println(setUnion);


        Set<Integer> setIntersection = new HashSet<>(set1);
        setIntersection.retainAll(set2);
        System.out.println(setIntersection);


        Set<Integer> setDifference = new HashSet<>(set1);
        setDifference.removeAll(set2);
        System.out.println(setDifference);


        Set<Integer> setDifference2 = new HashSet<>(set2);
        setDifference2.removeAll(set1);
        System.out.println(setDifference2);
    }
}
