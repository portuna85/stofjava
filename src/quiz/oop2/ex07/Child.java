package quiz.oop2.ex07;

public class Child extends Parent{
    public int x = 300;

    Child() {
        this(1000);
    }

    Child(int x) {
        this.x = x;
    }
}
