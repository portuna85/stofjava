package CollectsFramework.Set.TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();               // 정렬 필요 없음
        // Set set = new HashSet();            // 정렬 필요

        int from = 1;
        int to = 2;

        for (int i = 0; set.size() < 15; i++) {
            int num = (int) (Math.random() * 300) + 1;
            set.add(num);
        }

        System.out.println(set);
        System.out.println("rang search : from" + from + " to " + to);
        System.out.println("result1 : "+set.subSet(1, to));
        System.out.println("result1 : "+set.subSet(from, 3));
        System.out.println("50보다 작은 값" + set.headSet(50));
        System.out.println("50보다 큰 값" + set.tailSet(50));
        System.out.println("40과 80 사이의 값 : "+set.subSet(40,80));
    }
}