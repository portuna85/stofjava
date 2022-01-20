package test;

public class Test {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);
        int tmp;


        System.out.printf("%d\t%d\n", num1, num2);

        if(num2 < num1) {
            tmp = num1;
            num1 = num2;
            num2 = tmp;
            System.out.printf("%d\t%d", num1, num2);
        }
    }
}