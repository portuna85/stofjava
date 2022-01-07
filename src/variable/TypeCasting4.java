package variable;

public class TypeCasting4 {
    public static void main(String[] args) {
        int i = 91234567;
        float f = (float) i;
        int f2 = (int) f;

        double d = (double) i;

        System.out.println(i);
        System.out.println(f);
        System.out.println(f2);
    }
}