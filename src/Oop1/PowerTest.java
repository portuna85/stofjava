package Oop1;

public class PowerTest {
    public static void main(String[] args) {
        int x = 2, y = 5;
        long result = 0;

        for (int i = 0; i <= y; i++) {
            result += power(x, y);
        }
        System.out.println(result);
    }

    public static long power(int x, int y) {
        if (y == 1) {
            return x;
        }
        return x * power(x, y - 1);
    }
}
