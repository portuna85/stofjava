package Oop;

public class TvTest {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();

        tv1.power();
        tv1.channel = 8;
        tv1.channelDown();
        tv1.channelDown();
        System.out.println(tv1.channel);

        tv2.channelDown();
        tv2.channelDown();
        tv2.channelDown();
        tv2.channelDown();
        tv2.channelDown();
        tv2.channelDown();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        System.out.println(tv2.channel);
    }
}
