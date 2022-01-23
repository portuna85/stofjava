package quiz.oop1.ex21;

public class Exercise6_21 {
    public static void main(String args[]) {
        MyTv t = new MyTv();
        t.setChannel(100);
        t.setVolume(0);
        System.out.println("CH:" + t.getChannel() + ", VOL:" + t.getVolume());

        t.channelDown();
        t.volumeDown();
        System.out.println("CH:" + t.getChannel() + ", VOL:" + t.getVolume());

        t.setVolume(100);
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:" + t.getChannel() + ", VOL:" + t.getVolume());
    }
}