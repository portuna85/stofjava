package test.interface_text;

public class Ex7_15 {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        Outer2.InstanceInner iI = outer2.new InstanceInner();

        System.out.println(iI.iv);
        System.out.println(Outer2.StaticInner.cv);
    }
}

class Outer2 {
    class InstanceInner {
        int iv = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }

    void method() {
        System.out.println(StaticInner.cv);

        class LocalInner {
            int lv = 400;
        }
    }
}