package variable;

public class TypeCasting {
    public static void main(String[] args) {
        double d = 324.52;
        int i = (int) d;
        byte b = (byte) i;
        System.out.println(i + " " + d);
        System.out.println(b);

        float f1 = 3.141599247f;
        float f2 = 1.234567890f;
        double d1 = f1;

        double d2 = 6.97946124125;

        System.out.println(f1 + " " + d1 + " " + d2);
    }
}