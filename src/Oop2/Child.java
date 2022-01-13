package Oop2;

public class Child extends Parent {
    private static String str = "abc";

    public Child() {
        super(str);
    }

    public void childMethod() {
        super.parentMethod();
        SUM(4, 6);
    }


}

abstract class Abstract {
    abstract void walk();
}