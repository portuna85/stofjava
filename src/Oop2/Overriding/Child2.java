package Oop2.Overriding;

public class Child2 extends Parent2 {
    public void method() {
        int x = 200;
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
