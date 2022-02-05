package Lamda_Stream.LambdaPack.Lambda.LambdaInner;

public class Ex14_0 {
    public static void main(String[] args) {
        Myfunction obj = new Myfunction() {
            public int nike(int a, int b) {
                return a > b ? a : b;
            }
        };

        Myfunction f = (a, b) -> a > b ? a : b;

        int value = f.nike(3, 5);
        System.out.println(value);
    }
}

@FunctionalInterface
interface Myfunction {
    int nike(int a, int b);
}