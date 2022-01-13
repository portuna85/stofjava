package Oop2;

public class MypartTest1 extends MyParent {
    public static void main(String[] args) {
        MyParent myparent = new MyParent();

        // System.out.println(myparent.prv);       // 다른 클래스 접근불가.
        System.out.println(myparent.dft);
        System.out.println(myparent.prt);
        System.out.println(myparent.pub);
    }
}
