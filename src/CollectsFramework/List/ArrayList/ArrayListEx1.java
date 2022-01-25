package CollectsFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        new Vector();
        Car car = new Car();
        arrayList.add(new String("JKL "));
        arrayList.add(new String("ABC "));
        arrayList.add(new String("GHI "));
        arrayList.add(new String("DEF "));

        arrayList.add(new Car("Sonata"));
        arrayList.add(new Car("Matiz"));
        arrayList.add(new Car("Morning"));

        System.out.println(arrayList);

        System.out.println("Sort arrayList : " + arrayList);

        arrayList.remove(2);

        System.out.println(arrayList);

        System.out.println(car.getName());

        /*
        String[] str = new String[10];
        for (int i = 0; i < str.length; i++) {
            str[i] = car.setName(car.getName() + " " + i);
            System.out.println(str[i]);
        }
        */
    }
}