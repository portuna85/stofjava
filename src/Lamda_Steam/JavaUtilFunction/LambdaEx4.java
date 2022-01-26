package Lamda_Steam.JavaUtilFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        list.forEach(i -> System.out.print(i + ", "));
        System.out.println();

        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        System.out.println(list);

        list.replaceAll(i -> i * 10);
        System.out.println(list);

        HashMap<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        map.put("5", "5");

        map.forEach((x, v) -> System.out.print("{" + x + ", " + v + "}" + " "));
    }
}
