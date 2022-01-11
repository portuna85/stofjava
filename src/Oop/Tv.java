package Oop;

public class Tv {
    // Tv의 속성(멤버 변수)
    public String color;
    public boolean power;
    public int channel;
    public static boolean mute;

    int arr[] = new int[3];
    // Tv의 기능(메소드)
    public void power() {
        System.out.println("전원이 켜집니다.");
    }

    public void channelUp() {
        System.out.println("채널 하나를 올립니다.");
        ++channel;
    }

    public static void staticMethod() {

    }

    public static int add(int x, int y) {
        return x + y;
    }

    public int multiple(int x, int y) {
        return x * y;
    }

    public int compareNum(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public int minNum(int x, int y) {
        return (x < y) ? x : y;
    }

    public void channelDown() {
        System.out.println("채널 하나를 내립니다.");
        --channel;
    }
}