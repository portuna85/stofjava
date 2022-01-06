package variable;

public class ChangeNum {
    public static void main(String[] args) {
        int score = 95;
        final int num = 3;


        System.out.println(score + " " + num);
        score = 20;
        System.out.println(score);
    }
}