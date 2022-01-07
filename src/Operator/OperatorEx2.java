package Operator;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = ++i;
        System.out.println("j = ++i; " + j + " i : " + i);

        i = 5;
        j = 0;

        j = i++;
        System.out.println("j = i++; " + j + " i : " + i);
    }
}
