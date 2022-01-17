package Oop2.Abstract_Interface;

abstract class Unit1 {
    int x, y;

    abstract void move(int x, int y);

    public void stop() {
        System.out.println("정지");
    }
}

interface Fightable1 {
    public abstract void move(int x, int y);

    public abstract void funch(Fightable1 f);

    public abstract Fightable1 getFightable(Fightable1 f, Fightable1 f1);

    public abstract Fightable1 getFightable(Fightable1 f2);
}

class Fighter1 extends Unit1 implements Fightable1 {
    public void move(int x, int y) {
        System.out.println(x + y);
    }

    public void funch(Fightable1 f) {
        System.out.println(f);
    }

    public Fightable1 getFightable(Fightable1 f2) {
        return new Fighter1();
    }

    public Fightable1 getFightable(Fightable1 f2, Fightable1 f3) {
        return new Fightable1() {
            @Override
            public void move(int x, int y) {

            }

            @Override
            public void funch(Fightable1 f) {

            }

            @Override
            public Fightable1 getFightable(Fightable1 f, Fightable1 f1) {
                return null;
            }

            @Override
            public Fightable1 getFightable(Fightable1 f2) {
                return null;
            }
        };
    }

    @Override
    public String toString() {
        return "Fighter1{}";
    }
}

public class FiterTest {
    public static void main(String[] args) {
        Fightable1 f1 = new Fighter1();
        f1.move(4, 6);
        f1.funch(new Fighter1());

        Unit1 u = new Fighter1();
        u.stop();
        u.move(4, 4);
    }
}