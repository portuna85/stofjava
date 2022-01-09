package ConditionalLoop;

public class FlowEx15 {
    public static void main(String[] args) {
        System.out.println("i \t 2*i\t2*i-1\ti*i\t11-i\ti%3\ti/3");
        System.out.println("-------------------------------------");

        for (int i = 0; i < 11; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d%n", i, i * 2, i * 2 - 1, i * i, 11 - i, i % 3, i / 3);

        }
    }
}
