package ConditionalLoop;

public class FlowEx24 {
    public static void main(String[] args) {
        int countDown = 10;

        System.out.println("카운트 다운 시작");
        while(countDown-- != 0) {
            System.out.println(countDown);
            for (int i = 0; i < 2_000_000_000; i++) {

            }
        }
        System.out.println("발사");
    }
}
