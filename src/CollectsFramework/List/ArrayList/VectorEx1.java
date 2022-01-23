package CollectsFramework.List.ArrayList;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        Vector vector = new Vector(5);

        vector.add(1);
        vector.add(2);
        vector.add(3);
        print(vector);

        vector.trimToSize();
        System.out.println("=== After trimToSize() ===");
        print(vector);

        vector.ensureCapacity(6);
        System.out.println("=== After ensureCapacity(6) ===");
        print(vector);

        vector.setSize(7);
        System.out.println("=== After setSize(7) ===");
        print(vector);

        vector.clear();
        System.out.println("=== After clear() ===");
        print(vector);
    }

    public static void print(Vector v) {
        System.out.println(v);
        System.out.println("size : " + v.size());
        System.out.println("capacity : " + v.capacity());
    }
}
