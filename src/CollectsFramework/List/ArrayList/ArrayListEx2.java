package CollectsFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        Car car = new Car();
        arrayList1.add(new String("JKL "));
        arrayList1.add(new String("ABC "));
        arrayList1.add(new String("GHI "));
        arrayList1.add(new String("DEF "));
        arrayList1.add(car.setName("Sonata"));
        arrayList1.add(car.setName("Sonata5"));
        arrayList1.add(car.setName("Sonata1"));
        arrayList1.add(car.setName("Sonata3"));
        arrayList1.add(car.setName("Matiz"));
        arrayList1.add(car.setName("Aorning"));
        arrayList1.add(car.setName("Morning"));
        arrayList1.add(car.setName("BMorning"));

        System.out.println(arrayList1);

        arrayList1.remove(2);
        Collections.sort(arrayList1);
        System.out.println(arrayList1);
        System.out.println("Car.getName  = " + car.getName());

        /*
        String[] str = new String[10];
        for (int i = 0; i < str.length; i++) {
            str[i] = car.setName(car.getName() + ", " + i);
            System.out.println(str[i]);
        }*/
    }
}