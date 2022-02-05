package quiz.oop2.ex10;

public class Exercise7_10 {
    public static void main(String[] args) {
        MyTv myTv = new MyTv();

        System.out.println("CH : " + myTv.getChannel());
        myTv.setChannel(10);
        System.out.println("CH : " + myTv.getChannel());

        System.out.println("volume  : " + myTv.getVolume());
        myTv.setVolume(90);
        System.out.println("volume  : " + myTv.getVolume());

    }
}
