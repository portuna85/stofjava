package Oop1;

public class TvTest {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();

        tv1.channel = 8;
        System.out.println(tv1.channel);

        tv2 = tv1;

        System.out.println(tv2.channel);

        tv1.channelUp();
        tv2.channelDown();
        System.out.println(tv1.channel);
        System.out.println(tv2.channel);
    }
}
