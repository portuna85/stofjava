package quiz.oop2.ex07;

public class Parent {
    public int x = 10;

    public Parent(int x) {
        this.x = x;
    }

    public Parent() {
        this(200);
    }

    public int getX() {
        System.out.println("Parent.getX");
        return x;
    }
}
