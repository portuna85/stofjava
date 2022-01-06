package variable;

public class PrintNum {
    public static void main(String[] args) {
        System.out.printf("%d%n", 15);
        System.out.printf("%#o%n", 15);
        System.out.printf("%#x%n", 15);
        System.out.printf("%#X%n", 15);
        System.out.printf("%s%n", Integer.toBinaryString(15));

        float tex = 1.23456789f;
        System.out.printf("%f%n", tex);
        System.out.printf("%e%n", tex);

    }
}
