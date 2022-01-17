package test.interface_text;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        if (f instanceof Unit) {
            System.out.println("f는 Unit클래스의 자손입니다.");
        }

        if (f instanceof Fightable) {
            System.out.println("f는 Fightable인터페이스를 구현했습니다.");
        }

        if (f instanceof Movable) {
            System.out.println("f는 Movable인터페이스를 구현했습니다.");
        }

        if (f instanceof Attackable) {
            System.out.println("f는 Fightable인터페이스를 구현했습니다.");
        }

        if (f instanceof Object) {
            System.out.println("f는 Attackable클래스의 자손입니다.");
        }
    }
}

class Fighter extends Unit implements Fightable {
    @Override
    public void move(int x, int y) {}

    @Override
    public void attack(Unit unit) {}
}

class Unit {
    public int currentHP;
    public int x;
    public int y;
}

interface Fightable extends Movable, Attackable {}
interface Movable {
    public void move(int x, int y);
}
interface Attackable{
    public void attack(Unit unit);
}