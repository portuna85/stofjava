package Oop2.AbsClass;

abstract class Player {
    abstract void play(int pos);

    abstract void stop();
}

class AudioPlayer extends Player {
    void play(int pos) {
        System.out.println(pos + "의 위치 시작");
    }

    void stop() {
        System.out.println("멈춰!");
    }

}

public class PlayerTest {
    public static void main(String[] args) {
        AudioPlayer au = new AudioPlayer();
        Player p = new AudioPlayer();

        au.play(100);
        au.stop();

        p.play(200);
        p.stop();
    }
}