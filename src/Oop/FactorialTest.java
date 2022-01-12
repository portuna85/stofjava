package Oop;

public class Factorial {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);
    }

    static int factorial(int a) {
        int result = 0;
        if (a == 1) {
            result = 1;
        } else {
            result = a * factorial(a - 1);
        }
        return result;
    }
}