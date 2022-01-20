package CollectsFramework.List.ArrayList;

import java.util.ArrayList;

public class ArrayListEx3 {
    public static void main(String[] args) {
        ArrayList arrayList3 = new ArrayList();
        int i1 = (int) (Math.random() * 10);

        if (arrayList3.isEmpty()) {
            for (int i = 3; i <= 19; i++) {
                arrayList3.add(i);
            }
        } else {
            arrayList3.removeAll(arrayList3);
        }
        System.out.println(i1 - 1 + "번째 배열 삭제전 : " + arrayList3);
        arrayList3.remove(i1);

        System.out.println(i1 - 1 + "번째 배열 삭제후 : " + arrayList3);
    }
}