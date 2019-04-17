import java.util.HashSet;
import java.util.Set;

public class Question3 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(5);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        Set<Integer> set2 = new HashSet<>(5);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println(set1.stream().mapToInt(value -> value).sum()+set2.stream().mapToInt(value -> value).sum());
        Set<Integer> set3 = new HashSet<>();
        set3.addAll(set1);
        set3.retainAll(set2);
        set3.stream().forEach(integer -> System.out.print(" "+integer+" "));
        System.out.println();
        set1.removeAll(set2);
        set1.stream().forEach(integer -> System.out.print(" "+integer+" "));

    }
}
