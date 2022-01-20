package JavaLang.Math;

public class MathEx2 {
    public static void main(String[] args) {
        double x = 0;
        double y = 0;
        double z = 0;

        for (double i = 0.5; i < 10.5; i++) {
            double d1 = Math.round(i);
            double d2 = Math.rint(i);

            System.out.println("ROUND : " + d1);
            System.out.println("RINT : " + d2);

            x += d1;
            y += d2;
        }

        System.out.println();
        System.out.println("ROUND 합 : " + x);
        System.out.println("RINT 합 : " + y);
    }
}
