package JavaLang.Integer;

import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck;

import java.math.BigInteger;

public class wrapper {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        System.out.println(i1.compareTo(i2));
        System.out.println(i1.toString());
        System.out.println(i2.toString());
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.TYPE);


        Number num = new Number() {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        };

    }
}
