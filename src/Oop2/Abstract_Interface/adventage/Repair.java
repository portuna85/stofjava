package Oop2.Abstract_Interface.adventage;

public class Repair {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);
    }
}

interface Repairable {}
interface Movable {
    public void move(int x, int y);
    void move(int x, int y,int z);
}

interface Fightable extends Movable, Repairable {}

class Unit {
    int hitPoint;
    final int MAX_HP;

    Unit(int hp) {
        this.MAX_HP = hp;
    }
}

class GroundUnit extends Unit {
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit {
    AirUnit(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(250);
        super.hitPoint = super.MAX_HP;
    }

    @Override
    public String toString() {
        return "Tank{}";
    }
}

class Marine extends GroundUnit {
    Marine() {
        super(40);
        super.hitPoint = super.MAX_HP;
    }
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        super.hitPoint = super.MAX_HP;
    }

    void repair(Repairable r) {
        System.out.println("수리합니다.");
    }
}
