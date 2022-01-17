package Oop2.Abstract_Interface;

public class FighterMain {
    public static void main(String[] args) {


    }
}

class Unit2 {
    public void attack() {
    }
}

class Fighter extends Unit2 implements Fightable, Moveable, Attackable {

    Unit2 u = new Fighter();


    public Fighter run() {

        return new Fighter();
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void attack(int x, int y) {

    }
}

interface Fightable {
}

abstract interface Moveable {
    public void move(int x, int y);
}

abstract interface Attackable {
    public void attack(int x, int y);
}