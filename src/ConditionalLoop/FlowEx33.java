package ConditionalLoop;

public class FlowEx33 {
    public static void main(String[] args) {
        Loop1:
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <= 9; j++) {

                if (j == 5) {
                    //break Loop1;
                    //break;
                    //continue Loop1;
                    continue;
                }

                System.out.println(i + " X " + j + " = " + i * j);

            }
            System.out.println();
        }
    }
}