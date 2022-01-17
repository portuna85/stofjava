package Oop2.AbsClass;

/*
    추상클래스

 */
public class MoveEx {
    public static void main(String[] args) {
        Unit[] group = {new Marine(), new Tank(), new Marine()};
        Unit[] group1 = new Unit[3];
        group1[0] = new Marine();
        group1[1] = new Tank();
        group1[2] = new Marine();



        for (int i = 0; i < group.length; i++) {
            group[i].go();
            group[i].stop();
        }
    }
}

abstract class Unit {
    public int x, y;

    abstract void move(int x, int y);

    public void go() {
    }


    public void stop() {
        System.out.println("멈춰!");
    }
}

class Marine extends Unit {
    public void move(int x, int y) {
        System.out.println("Marin [x : " + x + ", y : " + y + "]");
    }

    public void go(int x, int y){
        System.out.println("Marin [x : " + x + ", y : " + y + ']');
    }

    public void stimPack() {
        System.out.println("스팀팩 사용");
    }
}

class Tank extends Unit {
    public void move(int x, int y) {
        System.out.println("Tank [x : " + x + ", y : " + y + "]");
    }

    public void go(int x, int y){
        System.out.println("Tank [x : " + x + ", y : " + y + ']');
    }

    public void changeMode() {
        System.out.println("모드 변경");
    }
}

class DropShip extends Unit {
    public void move(int x, int y) {
        System.out.println("DropShip [x : " + x + ", y : " + y + "]");
    }

    public void go(int x, int y){
        System.out.println("DropShip [x : " + x + ", y : " + y + ']');
    }

    public void load() {
        System.out.println("유닛 태움");
    }

    public void unLoad() {
        System.out.println("유닛 내림");
    }
}