package JavaLang.Math;

public class MathEx1 {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        System.out.println(Math.round(PI));
        System.out.println(Math.ceil(10.22));     // 올림하여 반환
        System.out.println(Math.ceil(-10.22));    // 올림하여 반환

        System.out.println();
        System.out.println(Math.min(-2, -99));
        System.out.println(Math.max(24,734));

        System.out.println();
        System.out.println(Math.rint(29.2));
        System.out.println(Math.rint(29.7));
        System.out.println(Math.rint(29.5));
        System.out.println(Math.rint(30.5));

        System.out.println();
        System.out.println(Math.round(29.2));
        System.out.println(Math.round(29.7));
        System.out.println(Math.round(29.5));
        System.out.println(Math.round(30.5));
        double num = 345.14156;

        System.out.println((double)Math.round(num));


    }
}
