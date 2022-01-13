package Oop1;

public class MathEx {
    public static void main(String[] args) {
        MethodOverloding meth = new MethodOverloding();

        int result = meth.add(3,6,8);
        System.out.println(result);

        float result1 = meth.average(result, 12);
        System.out.println(result1);
    }
}
